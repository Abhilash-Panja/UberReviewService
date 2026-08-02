package org.example.uberreviewservice.service;

import lombok.RequiredArgsConstructor;
import org.example.uberreviewservice.dto.passenger.*;
import org.example.uberreviewservice.exception.PassengerNotFoundException;
import org.example.uberreviewservice.mapper.PassengerMapper;
import org.example.uberreviewservice.model.Passenger;
import org.example.uberreviewservice.repository.PassengerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PassengerServiceImpl implements PassengerService {

    private final PassengerRepository passengerRepository;

    @Override
    public PassengerResponseDTO createPassenger(PassengerRequestDTO requestDTO) {
        validatePassengerRequest(requestDTO);

        Passenger passenger = PassengerMapper.toEntity(requestDTO);
        Passenger saved = passengerRepository.save(passenger);
        return PassengerMapper.toResponseDTO(saved);
    }

    @Override
    public PassengerResponseDTO getPassenger(Long id) {
        Passenger passenger = passengerRepository.findById(id)
                .orElseThrow(() -> new PassengerNotFoundException(id));
        return PassengerMapper.toResponseDTO(passenger);
    }

    @Override
    public List<PassengerResponseDTO> getAllPassengers() {
        return passengerRepository.findAll().stream()
                .map(PassengerMapper::toResponseDTO)
                .toList();
    }

    @Override
    public PassengerResponseDTO updatePassenger(Long id, PassengerRequestDTO requestDTO) {
        validatePassengerRequest(requestDTO);

        Passenger passenger = passengerRepository.findById(id)
                .orElseThrow(() -> new PassengerNotFoundException(id));

        passenger.setPassengerName(requestDTO.getPassengerName());

        Passenger updated = passengerRepository.save(passenger);
        return PassengerMapper.toResponseDTO(updated);
    }

    @Override
    public void deletePassenger(Long id) {
        if (!passengerRepository.existsById(id)) {
            throw new PassengerNotFoundException(id);
        }
        passengerRepository.deleteById(id);
    }

    private void validatePassengerRequest(PassengerRequestDTO requestDTO) {
        if (requestDTO.getPassengerName() == null || requestDTO.getPassengerName().isBlank()) {
            throw new IllegalArgumentException("Passenger name must not be empty");
        }
    }
}