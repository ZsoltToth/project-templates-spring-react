package hu.uni.eku.tzs.controller.dto;

import hu.uni.eku.tzs.model.Customer;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class ReservationDto {

    private int id;
    private int slotId;
    private Date start;
    private Date end;
    private boolean electricity;
    private boolean caravan;
    private Customer customer;
    private boolean paid;

}
