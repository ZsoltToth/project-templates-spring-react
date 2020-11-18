package hu.uni.eku.tzs.controller.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
import org.joda.time.DateTime;

@Data
@Builder
public class GuestDto {
    private String name;
    private String identityNumber;
    private Date dateOfBirth;
    private DateTime arrivalDate;
    private DateTime departureDate;

}
