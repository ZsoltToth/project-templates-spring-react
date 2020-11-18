package hu.uni.eku.tzs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guest {
    private String name;
    private String identityNumber;
    private Date dateOfBirth;
    private Date arrivalDate;
    private Date departureDate;
}