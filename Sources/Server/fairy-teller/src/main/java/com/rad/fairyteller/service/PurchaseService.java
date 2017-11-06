package com.rad.fairyteller.service;

import com.rad.fairyteller.domain.purchase.Purchase;
import com.rad.fairyteller.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {
    private final PurchaseRepository purchaseRepository;

    @Autowired
    public PurchaseService(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    public void saveOrUpdatePurchase(Purchase purchase){
        purchaseRepository.save(purchase);
    }

    public List<Purchase> getPurchaseListByUserId(Long userId){
        return purchaseRepository.findAllByUserId(userId);
    }

    public Purchase getById(Long id) {
        return purchaseRepository.findOne(id);
    }
}
