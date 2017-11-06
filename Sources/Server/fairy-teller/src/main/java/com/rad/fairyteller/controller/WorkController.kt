package com.rad.fairyteller.controller

import com.rad.fairyteller.domain.work.Work
import com.rad.fairyteller.service.WorkService
import org.springframework.web.bind.annotation.*

@RestController
class WorkController(private val workService: WorkService) {

    @RequestMapping(path = arrayOf("/worksByUserId/{id}"))
    fun getWorks(@PathVariable id: Long): List<Work> {
        return workService.getWorksByUserId(id)
    }

    @RequestMapping(path = arrayOf("/work"), method = arrayOf(RequestMethod.POST))
    fun saveOrUpdateWork(@RequestParam work: Work) =
            workService.saveOrUpdateWork(work)
}