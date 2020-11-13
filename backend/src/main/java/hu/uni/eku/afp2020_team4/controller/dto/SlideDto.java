package hu.uni.eku.afp2020_team4.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SlideDto {
    private Integer slideId;
    private String name;
    private double price;
}
