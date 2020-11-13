package hu.uni.eku.afp2020_team4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Slide {
    private int id;
    private String name;
    private double price;
}
