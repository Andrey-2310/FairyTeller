package com.rad.fairyteller.service.dto.purchaseDto;

import com.rad.fairyteller.service.dto.workDto.WorkDto;
import lombok.Data;

@Data
public class PurchaseDto {

    private Long id;
    private int price;
    private WorkDto work;
    private String date;
}
