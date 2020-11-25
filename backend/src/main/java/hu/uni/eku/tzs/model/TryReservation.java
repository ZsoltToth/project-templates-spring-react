package hu.uni.eku.tzs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TryReservation {
    private String customerEmail;
    private int slotId;
    private LocalDate start;
    private LocalDate end;
    private boolean electricity;
    private boolean caravan;

}
