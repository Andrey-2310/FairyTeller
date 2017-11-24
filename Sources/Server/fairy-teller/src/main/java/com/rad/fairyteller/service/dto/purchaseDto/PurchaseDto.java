package com.rad.fairyteller.service.dto.purchaseDto;

import lombok.Data;

@Data
public class PurchaseDto {
    private Long id;
    private int price;
    private Long userId;
    private Long workId;
    private String date;
}
