package hu.uni.eku.tzs.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BillDto {
    private int reservationId;
    private int campingSlotId;
    private String customerEmail;
    private int nights;
    private boolean electricity;
    private boolean caravan;
    private float totalPrice;
}
