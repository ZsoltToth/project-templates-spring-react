package hu.uni.eku.afp2020_team4.controller.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class TransactionCreateRequestDto {
    private int userId;
    private int watchId;
    private int slideId;
    private Date timestamp;
}
