package com.rad.fairyteller.controller

import com.rad.fairyteller.domain.purchase.Purchase
import com.rad.fairyteller.service.PurchaseService
import com.rad.fairyteller.service.dto.PurchaseDto
import com.rad.fairyteller.service.mapper.PurchaseMapper
import org.springframework.web.bind.annotation.*

@RestController
class PurchaseController(private val purchaseService: PurchaseService) {

    @RequestMapping(path = arrayOf("/purchaseListByUserId/{id}"))
    fun getPurchaseListByUserId(@PathVariable id: Long): List<PurchaseDto> {
        return PurchaseMapper.INSTANCE.toDto(purchaseService.getPurchaseListByUserId(id))
    }

    @RequestMapping(path = arrayOf("/purchase/save"), method = arrayOf(RequestMethod.POST))
    fun saveOrUpdatePurchase(@RequestParam purchase: Purchase) =
            purchaseService.saveOrUpdatePurchase(purchase)

    @RequestMapping(path = arrayOf("/purchase/save"))
    fun savePurchase() {
        val purchase = PurchaseMapper.INSTANCE.toEntity(PurchaseDto(102, 2L, 1L))
        purchaseService.saveOrUpdatePurchase(purchase)
    }
}
