package hu.uni.eku.tzs.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerDto {
    private int id;

    private String name;

    private String address;

    private String phoneNumber;

    private String email;
}
