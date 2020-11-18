package hu.uni.eku.team3.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class SummaryDto {
    private int id;
    private int identityNumber;
    private int servicesID;
    private int barCode;
}

