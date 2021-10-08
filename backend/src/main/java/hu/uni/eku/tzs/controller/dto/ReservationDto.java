package hu.uni.eku.tzs.controller.dto;

import hu.uni.eku.tzs.model.Customer;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Builder
public class ReservationDto {

    private int id;
    private int slotId;
    private LocalDate start;
    private LocalDate end;
    private boolean electricity;
    private boolean caravan;
    private Customer customer;
    private boolean paid;

}
