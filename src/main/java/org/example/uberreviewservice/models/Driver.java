package org.example.uberreviewservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends BaseModel{
    private String driverName;
    private  String licenceNumber;
    @OneToMany(mappedBy = "driver")
    List<Booking> bookingList=new ArrayList<>();
}
