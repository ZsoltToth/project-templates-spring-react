package hu.uni.eku.tzs.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import org.joda.time.DateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GuestRecordRequestDto {
    private String name;
    private String identityNumber;
    private Date dateOfBirth;
    private DateTime arrivalDate;
    private DateTime departureDate;
}
