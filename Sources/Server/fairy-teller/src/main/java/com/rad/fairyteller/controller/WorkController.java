package com.rad.fairyteller.controller;

import com.rad.fairyteller.domain.work.Work;
import com.rad.fairyteller.service.WorkService;
import com.rad.fairyteller.service.dto.workDto.WorkDto;
import com.rad.fairyteller.service.mapper.WorkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WorkController {
    private final WorkService workService;

    @Autowired
    public WorkController(WorkService masterpieceService) {
        this.workService = masterpieceService;
    }

    @RequestMapping(path = "/worksByAuthorId/{id}")
    public List<WorkDto> getWorks(@PathVariable Long id) {
        return WorkMapper.INSTANCE.toDto(workService.getWorksByAuthorId(id));
    }

    @RequestMapping(path = "/work", method = RequestMethod.POST)
    public void saveOrUpdateWork(@RequestParam Work work) {
        workService.saveOrUpdateWork(work);
    }

}