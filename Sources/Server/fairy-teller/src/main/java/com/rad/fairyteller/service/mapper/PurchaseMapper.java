package com.rad.fairyteller.service.mapper;

import com.rad.fairyteller.domain.purchase.Purchase;
import com.rad.fairyteller.service.dto.purchaseDto.PurchaseDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PurchaseMapper extends EntityMapper<PurchaseDto, Purchase> {
    PurchaseMapper INSTANCE = Mappers.getMapper(PurchaseMapper.class);

//    @Mappings({
//            @Mapping(target = "userId", source = "purchase.user.id"),
//            @Mapping(target = "workId", source = "purchase.work.id"),
//    })
    PurchaseDto toDto(Purchase purchase);

    List<PurchaseDto> toDto(List<Purchase> purchaseList);

    @InheritInverseConfiguration
    Purchase toEntity(PurchaseDto purchaseDto);

    List<Purchase> toEntity(List<PurchaseDto> purchaseDto);
}