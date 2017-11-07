package com.rad.fairyteller.service.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PurchaseDto {

    private Long id;
    private int price;
    private Long userId;
    private Long workId;

}
