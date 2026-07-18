package org.example.uberreviewservice.models;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalTime;


@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseModel{
    LocalTime startTime;
    LocalTime endTime;
    long totalDistance;
    BookingStatus bookingStatus;
}
