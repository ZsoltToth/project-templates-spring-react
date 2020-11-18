package hu.uni.eku.team3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guest {
    private String identityNumber;
    private String name;
    private Date dateOfBirth;
    private Date arrivalDate;
    private Date departureDate;
}