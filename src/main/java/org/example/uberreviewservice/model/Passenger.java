package org.example.uberreviewservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Passenger extends BaseModel{
    private String passengerName;
    @OneToMany(mappedBy = "passenger")
    private List<Booking>bookingList=new ArrayList<>();
}
