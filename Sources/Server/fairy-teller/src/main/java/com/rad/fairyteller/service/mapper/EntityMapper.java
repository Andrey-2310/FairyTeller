package com.rad.fairyteller.service.mapper;

import org.mapstruct.InheritInverseConfiguration;

import java.util.List;

public interface EntityMapper<D, E> {

    @InheritInverseConfiguration
    E toEntity(D dto);

    D toDto(E entity);

    List<E> toEntity(List<D> dtoList);

    List<D> toDto(List<E> entityList);
}