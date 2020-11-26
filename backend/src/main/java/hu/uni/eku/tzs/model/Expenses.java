package hu.uni.eku.tzs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Expenses {
    private int reservationId;
    private String customerEmail;
    private int campingSlotId;
    private LocalDate start;
    private LocalDate end;
    private int campingSlotPrice;
    private boolean electricity;
    private boolean caravan;
}
