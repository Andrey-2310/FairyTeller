package com.rad.fairyteller.controller;

import com.rad.fairyteller.domain.purchase.Purchase;
import com.rad.fairyteller.service.dto.PurchaseDto;
import com.rad.fairyteller.service.mapper.PurchaseMapper;
import com.rad.fairyteller.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PurchaseController {
    private final PurchaseService purchaseService;


    @Autowired
    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @RequestMapping(path = "/purchaseListByUserId/{id}")
    public List<PurchaseDto> getPurchaseListByUserId(@PathVariable Long id) {
        return PurchaseMapper.INSTANCE.toDto(purchaseService.getPurchaseListByUserId(id));
    }

    @RequestMapping(path = "/purchase/save", method = RequestMethod.POST)
    public void saveOrUpdatePurchase(@RequestParam Purchase purchase) {
        purchaseService.saveOrUpdatePurchase(purchase);
    }
}
