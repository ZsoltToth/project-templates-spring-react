package hu.uni.eku.camping.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ComplexNumberRecordRequestDto {

    private double real;
    private double imag;
}
