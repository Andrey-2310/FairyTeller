package com.rad.fairyteller.service.mapper;


import com.rad.fairyteller.domain.unit.Unit;
import com.rad.fairyteller.service.dto.unitDto.UnitDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UnitMapper extends EntityMapper<UnitDto, Unit> {
}
