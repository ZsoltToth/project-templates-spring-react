package hu.uni.eku.afp2020_team4.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ComplexNumberDto {

    private double real;
    private double imaginary;
}
