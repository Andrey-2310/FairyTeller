package com.rad.fairyteller.controller;

import com.rad.fairyteller.domain.Purchase;
import com.rad.fairyteller.service.PurchaseService;
import com.rad.fairyteller.service.dto.PurchaseDto;
import com.rad.fairyteller.service.mapper.PurchaseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class PurchaseController {

    private final PurchaseService purchaseService;
    private final PurchaseMapper purchaseMapper;

    @RequestMapping(path = "/purchaseListByUserId/{id}")
    public List<PurchaseDto> getPurchaseListByUserId(@PathVariable Long id) {
        return purchaseMapper.toDto(purchaseService.getPurchaseListByUserId(id));
    }

    @RequestMapping(path = "/purchase/save", method = RequestMethod.POST)
    public void saveOrUpdatePurchase(@RequestBody Purchase purchase) {
        purchaseService.saveOrUpdatePurchase(purchase);
    }
}
