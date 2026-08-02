package org.example.uberreviewservice.dto.booking;

import lombok.*;
import org.example.uberreviewservice.model.BookingStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookingStatusUpdateDTO {
    private BookingStatus newStatus;
}
