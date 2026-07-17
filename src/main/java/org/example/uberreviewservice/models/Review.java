package org.example.uberreviewservice.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Table(name = "review_table")
@Setter
@Getter
@Builder
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private  Long reviewId;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private LocalDate createdDate;

    @Column(nullable = false)
    private LocalDateTime lastUpdatedDate;

    @Column(nullable = false)
    private double rating;

}
