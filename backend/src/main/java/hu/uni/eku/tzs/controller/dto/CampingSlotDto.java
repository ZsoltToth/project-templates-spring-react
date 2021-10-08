package hu.uni.eku.tzs.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CampingSlotDto {
    private int id;
    private int coordinateX;
    private int coordinateY;
    private int price;
    private Boolean status;
    private String description;
}
