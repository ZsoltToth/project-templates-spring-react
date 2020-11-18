package hu.uni.eku.tzs.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class SummaryDto {
    private int summaryID;
    private int identityNumber;
    private int servicesID;
    private int barCode;
}

