package com.rad.fairyteller.service;

import com.rad.fairyteller.mapping.dto.UnitDto;
import com.rad.fairyteller.mapping.mapper.UnitMapper;
import com.rad.fairyteller.repository.UnitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UnitService {

    private final UnitMapper unitMapper;
    private UnitRepository unitRepository;

    public UnitDto findUnitById(Long id) {
        return unitMapper.toDto(unitRepository.findOne(id));
    }
}
