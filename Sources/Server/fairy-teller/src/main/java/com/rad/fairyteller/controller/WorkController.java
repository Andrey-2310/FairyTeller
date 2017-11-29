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
    private final WorkMapper workMapper;

    @Autowired
    public WorkController(WorkService workService, WorkMapper workMapper) {
        this.workService = workService;
        this.workMapper = workMapper;
    }

    @RequestMapping(path = "/worksByAuthorId/{id}")
    public List<WorkDto> getWorks(@PathVariable Long id) {
        return workMapper.toDto(workService.getWorksByAuthorId(id));
    }

    @RequestMapping(path = "/work", method = RequestMethod.POST)
    public void saveOrUpdateWork(@RequestParam Work work) {
        workService.saveOrUpdateWork(work);
    }

}