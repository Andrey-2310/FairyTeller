package com.rad.fairyteller.service

import com.rad.fairyteller.domain.purchase.Purchase
import com.rad.fairyteller.repository.PurchaseRepository
import org.springframework.stereotype.Service

@Service
class PurchaseService(private val purchaseRepository: PurchaseRepository) {

    fun saveOrUpdatePurchase(purchase: Purchase) {
        purchaseRepository.save(purchase)
    }

    fun getPurchaseListByUserId(userId: Long?): List<Purchase> {
        return purchaseRepository.findAllByUserId(userId)
    }

    fun getById(id: Long?): Purchase {
        return purchaseRepository.findOne(id)
    }
}