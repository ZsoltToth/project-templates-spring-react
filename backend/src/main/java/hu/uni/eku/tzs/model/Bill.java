package hu.uni.eku.tzs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bill {
    private int reservationId;
    private int campingSlotId;
    private String customerEmail;
    private int nights;
    private boolean electricity;
    private boolean caravan;
    private float totalPrice;

}
