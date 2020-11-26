package hu.uni.eku.tzs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    private int id;
    private int slotId;
    private LocalDate start;
    private LocalDate end;
    private boolean electricity;
    private boolean caravan;
    private String customerEmail;
    private boolean paid;


}
