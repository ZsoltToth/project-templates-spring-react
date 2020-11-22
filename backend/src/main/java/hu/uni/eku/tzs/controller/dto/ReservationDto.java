package hu.uni.eku.tzs.controller.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class ReservationDto {

    private int id;
    private String customerEmail;
    private String customerName;
    private String phoneNumber;
    private String customerAddress;
    private int slotId;
    private Date start;
    private Date end;

}
