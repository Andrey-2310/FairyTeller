package com.rad.fairyteller.service;

import com.rad.fairyteller.domain.unit.Unit;
import com.rad.fairyteller.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnitService {
    private UnitRepository unitRepository;

    @Autowired
    public UnitService(UnitRepository unitRepository) {
        this.unitRepository = unitRepository;
    }

    public Unit findUnitById(Long id) {
        return unitRepository.findOne(id);
    }
}
