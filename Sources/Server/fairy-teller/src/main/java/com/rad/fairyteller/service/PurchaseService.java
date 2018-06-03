package com.rad.fairyteller.service;

import com.rad.fairyteller.domain.Purchase;
import com.rad.fairyteller.mapping.dto.PurchaseDto;
import com.rad.fairyteller.mapping.mapper.PurchaseMapper;
import com.rad.fairyteller.repository.PurchaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PurchaseService {

    private final PurchaseRepository purchaseRepository;
    private final PurchaseMapper purchaseMapper;

    public void saveOrUpdatePurchase(final Purchase purchase) {
        Optional.ofNullable(purchase).ifPresent(purchaseRepository::save);
    }

    public List<PurchaseDto> getPurchaseListByUserId(final Long userId) {
        return purchaseMapper.toDto(purchaseRepository.findAllByUserId(userId));
    }

    public Purchase getById(final Long id) {
        return purchaseRepository.findOne(id);
    }
}
