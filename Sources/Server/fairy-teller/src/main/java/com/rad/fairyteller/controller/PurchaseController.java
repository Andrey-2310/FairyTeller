package com.rad.fairyteller.controller;

import com.rad.fairyteller.domain.Purchase;
import com.rad.fairyteller.service.PurchaseService;
import com.rad.fairyteller.service.dto.PurchaseDto;
import com.rad.fairyteller.service.mapper.PurchaseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class PurchaseController {

    private final PurchaseService purchaseService;
    private final PurchaseMapper purchaseMapper;

    @RequestMapping(path = "/purchaseListByUserId/{id}")
    public List<PurchaseDto> getPurchaseListByUserId(@PathVariable final Long id) {
        return purchaseMapper.toDto(purchaseService.getPurchaseListByUserId(id));
    }

    @PostMapping(path = "/purchase/save")
    public void saveOrUpdatePurchase(@RequestBody final Purchase purchase) {
        purchaseService.saveOrUpdatePurchase(purchase);
    }
}
