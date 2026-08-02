package org.example.uberreviewservice.repository;

import org.example.uberreviewservice.model.PassengerReview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PassengerReviewRepository extends JpaRepository<PassengerReview, Long> {
    Optional<PassengerReview> findByBookingId(Long bookingId);
}
