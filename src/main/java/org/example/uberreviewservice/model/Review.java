package org.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "booking_review")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseModel{

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private double rating;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(nullable = false)
    private Booking booking;

}
