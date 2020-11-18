package hu.uni.eku.team3.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductsDto{
        private int id;
        private String productName;
        private int productPrice;
        private int Adult;
}

