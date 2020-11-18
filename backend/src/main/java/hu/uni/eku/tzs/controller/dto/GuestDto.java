package hu.uni.eku.tzs.controller.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;


@Data
@Builder
public class GuestDto {
    private String name;
    private String identityNumber;
    private Date dateOfBirth;
    private Date arrivalDate;
    private Date departureDate;

}
