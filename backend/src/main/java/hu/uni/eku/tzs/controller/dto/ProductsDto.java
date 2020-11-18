package hu.uni.eku.tzs.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductsDto{
        private String productName;
        private int productPrice;
        private int barCode;
        private boolean Adult;
}

