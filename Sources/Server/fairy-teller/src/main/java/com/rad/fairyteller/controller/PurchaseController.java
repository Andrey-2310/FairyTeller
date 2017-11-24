package com.rad.fairyteller.controller;

import com.rad.fairyteller.domain.purchase.Purchase;
import com.rad.fairyteller.service.dto.purchaseDto.PurchaseDto;
import com.rad.fairyteller.service.mapper.PurchaseMapper;
import com.rad.fairyteller.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PurchaseController {
    private final PurchaseService purchaseService;
    private final PurchaseMapper purchaseMapper;


    @Autowired
    public PurchaseController(PurchaseService purchaseService, PurchaseMapper purchaseMapper) {
        this.purchaseService = purchaseService;
        this.purchaseMapper = purchaseMapper;
    }

    @RequestMapping(path = "/purchaseListByUserId/{id}")
    public List<PurchaseDto> getPurchaseListByUserId(@PathVariable Long id) {
        return purchaseMapper.toDto(purchaseService.getPurchaseListByUserId(id));
    }

    @RequestMapping(path = "/purchase/save", method = RequestMethod.POST)
    public void saveOrUpdatePurchase(@RequestParam Purchase purchase) {
        purchaseService.saveOrUpdatePurchase(purchase);
    }
}
