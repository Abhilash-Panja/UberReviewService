package org.example.uberreviewservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class PassengerReview extends Review{
    @Column(nullable = false)
    private String  passengerReviewContent;
    @Column(nullable = false)
    private double passengerRating;
}
