package org.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private  Long id;

    @Column(nullable = false, updatable = false)
    @CreatedDate
    private LocalDate createdDate;

    @Column(nullable = false)
    @LastModifiedDate
    private LocalDateTime lastUpdatedDate;
}
