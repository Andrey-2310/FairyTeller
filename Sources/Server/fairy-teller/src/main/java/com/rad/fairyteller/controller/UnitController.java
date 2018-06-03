package com.rad.fairyteller.controller;

import com.rad.fairyteller.mapping.dto.UnitDto;
import com.rad.fairyteller.service.UnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UnitController {

    private final UnitService unitService;

    @RequestMapping(path = "/findUnitById/{id}")
    public UnitDto findUnitById(@PathVariable final Long id) {
        return unitService.findUnitById(id);
    }
}
