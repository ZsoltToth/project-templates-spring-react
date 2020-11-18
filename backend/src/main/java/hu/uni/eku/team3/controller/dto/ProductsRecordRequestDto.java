package hu.uni.eku.team3.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductsRecordRequestDto{
    private int id;
    private String productName;
    private int productPrice;
    private int Adult;
}

