package com.rad.fairyteller.controller;

import com.rad.fairyteller.domain.book.Work;
import com.rad.fairyteller.service.WorkService;
import com.rad.fairyteller.service.dto.WorkDto;
import com.rad.fairyteller.service.mapper.WorkMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class WorkController {

    private final WorkService workService;
    private final WorkMapper workMapper;

    @RequestMapping(path = "/worksByAuthorId/{id}")
    public List<WorkDto> getworksByAuthorId(@PathVariable final Long id) {
        return workMapper.toDto(workService.getWorksByAuthorId(id));
    }

    @RequestMapping(path = "/nextPopularWorks/{from}")
    public List<WorkDto> getNextPopularWorks(@PathVariable final Integer from) {
        return workMapper.toDto(workService.getNextPopularWorks(from));
    }

    @PostMapping(path = "/work")
    public void saveOrUpdateWork(@RequestBody final Work work) {
        workService.saveOrUpdateWork(work);
    }
}
