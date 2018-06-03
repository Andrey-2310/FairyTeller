package com.rad.fairyteller.mapping.mapper;


import com.rad.fairyteller.domain.book.Unit;
import com.rad.fairyteller.mapping.dto.UnitDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UnitMapper extends EntityMapper<UnitDto, Unit> {
}
