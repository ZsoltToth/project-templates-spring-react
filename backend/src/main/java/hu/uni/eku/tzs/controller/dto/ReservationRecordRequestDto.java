package hu.uni.eku.tzs.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservationRecordRequestDto {
    private String customerEmail;
    private int slotId;
    private Date start;
    private Date end;
    private boolean electiricty;
    private boolean caravan;


}
