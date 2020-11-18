package hu.uni.eku.tzs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guest {
    private String name;
    private String identityNumber;
    private Date dateOfBirth;
    private LocalDateTime arrivalDate;
    private LocalDateTime departureDate;
}