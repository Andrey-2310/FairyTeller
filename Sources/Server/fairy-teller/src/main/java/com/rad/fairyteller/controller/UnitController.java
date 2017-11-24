package com.rad.fairyteller.controller;

import com.rad.fairyteller.service.UnitService;
import com.rad.fairyteller.service.dto.unitDto.UnitDto;
import com.rad.fairyteller.service.mapper.UnitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnitController {
    private final UnitService unitService;
    private final UnitMapper unitMapper;

    @Autowired
    public UnitController(UnitService unitService, UnitMapper unitMapper) {
        this.unitService = unitService;
        this.unitMapper = unitMapper;
    }

    @RequestMapping(path = "/findUnitById/{id}")
    public UnitDto findUnitById(@PathVariable Long id){
        return unitMapper.toDto(unitService.findUnitById(id));
    }

}
