package hu.uni.eku.tzs.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GuestRecordRequestDto {
    private String name;
    private String identityNumber;
    private Date dateOfBirth;
    private Date arrivalDate;
    private Date departureDate;
}
