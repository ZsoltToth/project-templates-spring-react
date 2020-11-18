package hu.uni.eku.team3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Summary {
    private int id;
    private int identityNumber;
    private int servicesID;
    private int barCode;
}