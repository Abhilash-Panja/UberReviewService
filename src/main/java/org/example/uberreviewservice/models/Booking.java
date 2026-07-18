package org.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalTime;


@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseModel{

    private LocalTime startTime;
    private LocalTime endTime;
    private long totalDistance;
    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Review review;
    @ManyToOne
    private Driver driver;
    @ManyToOne
    private  Passenger passenger;


}
