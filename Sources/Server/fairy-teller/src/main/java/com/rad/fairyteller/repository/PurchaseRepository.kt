package com.rad.fairyteller.repository

import com.rad.fairyteller.domain.purchase.Purchase
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PurchaseRepository : JpaRepository<Purchase, Long> {
    fun findAllByUserId(userId: Long?): List<Purchase>
}