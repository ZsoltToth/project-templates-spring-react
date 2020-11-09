package hu.uni.eku.afp2020_team4.controller.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@Data
@Builder
public class ReceiptDto {
    private String id;
    private String transactionId;
    private Collection<TransactionDto> transactions;
    private int total;
}
