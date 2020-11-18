package hu.uni.eku.team3.controller.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;


@Data
@Builder
public class GuestDto {
    private String identityNumber;
    private String name;
    private Date dateOfBirth;
    private Date arrivalDate;
    private Date departureDate;

}
