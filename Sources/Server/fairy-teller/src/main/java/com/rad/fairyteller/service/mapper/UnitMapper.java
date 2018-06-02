package com.rad.fairyteller.service.mapper;


import com.rad.fairyteller.domain.book.Unit;
import com.rad.fairyteller.service.dto.UnitDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UnitMapper extends EntityMapper<UnitDto, Unit> {
}
