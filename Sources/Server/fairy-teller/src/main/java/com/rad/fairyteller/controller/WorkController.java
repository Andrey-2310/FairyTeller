package com.rad.fairyteller.controller;

import com.rad.fairyteller.domain.work.Work;
import com.rad.fairyteller.service.WorkService;
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

    @RequestMapping(path = "/worksByUserId/{id}")
    public List<Work> getWorks(@PathVariable Long id) {
        return workService.getWorksByUserId(id);
    }

       @RequestMapping(path = "/work", method = RequestMethod.POST)
    public void saveOrUpdateWork(@RequestParam Work work) {
        workService.saveOrUpdateWork(work);
    }
}