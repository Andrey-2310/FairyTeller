package com.rad.fairyteller.service.mapper;

import com.rad.fairyteller.domain.purchase.Purchase;
import com.rad.fairyteller.service.dto.purchaseDto.PurchaseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PurchaseMapper extends EntityMapper<PurchaseDto, Purchase> {

    @Mappings({
            @Mapping(target = "userId", source = "purchase.user.id"),
            @Mapping(target = "workId", source = "purchase.work.id"),
    })
    PurchaseDto toDto(Purchase purchase);
}