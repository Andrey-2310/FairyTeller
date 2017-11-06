package com.rad.fairyteller.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
public class PurchaseDto {

    private Long id;
    private int price;
    private Long userId;
    private Long workId;

    public PurchaseDto(int price, Long userId, Long workId) {
        this.price = price;
        this.userId = userId;
        this.workId = workId;
    }
}
