package org.example.uberreviewservice.service;

import org.example.uberreviewservice.models.Review;
import org.example.uberreviewservice.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class ReviewService implements CommandLineRunner {
    @Autowired
    private ReviewRepository reviewRepository;
    @Override
    public void run(String... args) throws Exception {
        Review review= Review.builder()
                .description("Amazing Ride..")
                .rating(4.5D)
                .build();
        reviewRepository.save(review);

    }
}
