package hu.uni.eku.tzs.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CampingSlotRecordRequestDto {
    private int id;
    private int coordinateX;
    private int coordinateY;
    private int price;
    private Boolean status;
    private String description;
}
