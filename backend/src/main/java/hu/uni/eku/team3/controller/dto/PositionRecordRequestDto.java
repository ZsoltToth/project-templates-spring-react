package hu.uni.eku.team3.controller.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PositionRecordRequestDto {
    private String id;
    private String name;
}
