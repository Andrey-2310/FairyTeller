package com.rad.fairyteller.controller;

import com.rad.fairyteller.service.UnitService;
import com.rad.fairyteller.service.dto.UnitDto;
import com.rad.fairyteller.service.mapper.UnitMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UnitController {

    private final UnitService unitService;
    private final UnitMapper unitMapper;

    @RequestMapping(path = "/findUnitById/{id}")
    public UnitDto findUnitById(@PathVariable Long id){
        return unitMapper.toDto(unitService.findUnitById(id));
    }

}
