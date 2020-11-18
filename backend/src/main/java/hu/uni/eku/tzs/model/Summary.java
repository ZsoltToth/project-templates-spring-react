package hu.uni.eku.tzs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Summary {
    private int summaryID;
    private int identityNumber;
    private int servicesID;
    private int barCode;
}