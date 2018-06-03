package com.rad.fairyteller.service;

import com.rad.fairyteller.domain.Purchase;
import com.rad.fairyteller.repository.PurchaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PurchaseService {

    private final PurchaseRepository purchaseRepository;

    public void saveOrUpdatePurchase(final Purchase purchase) {
        Optional.ofNullable(purchase).ifPresent(purchaseRepository::save);
    }

    public List<Purchase> getPurchaseListByUserId(final Long userId) {
        return purchaseRepository.findAllByUserId(userId);
    }

    public Purchase getById(final Long id) {
        return purchaseRepository.findOne(id);
    }
}
