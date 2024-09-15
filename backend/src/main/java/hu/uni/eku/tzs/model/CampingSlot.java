package hu.uni.eku.tzs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CampingSlot {
    private int id;
    private int coordinateX;
    private int coordinateY;
    private int price;
    private Boolean status;
    private String description;
}
