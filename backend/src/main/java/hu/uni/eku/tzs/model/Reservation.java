package hu.uni.eku.tzs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    private int id;
    private String customerEmail;
    private String customerName;
    private String phoneNumber;
    private String customerAddress;
    private int slotId;
    private Date start;
    private Date end;


}
