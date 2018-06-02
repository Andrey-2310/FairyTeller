package com.rad.fairyteller.service;

import com.rad.fairyteller.domain.book.Unit;
import com.rad.fairyteller.repository.UnitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UnitService {

    private UnitRepository unitRepository;

    public Unit findUnitById(Long id) {
        return unitRepository.findOne(id);
    }
}
