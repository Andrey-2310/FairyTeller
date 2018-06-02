package com.rad.fairyteller.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PurchaseDto {
    private Long id;
    private int price;
    private Long userId;
    private Long workId;
    private String date;
}
