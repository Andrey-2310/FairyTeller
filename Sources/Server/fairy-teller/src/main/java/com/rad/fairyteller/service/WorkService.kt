package com.rad.fairyteller.service

import com.rad.fairyteller.domain.work.Work
import com.rad.fairyteller.repository.WorkRepository
import org.springframework.stereotype.Service

@Service
class WorkService(private val workRepository: WorkRepository) {

    fun saveOrUpdateWork(work: Work) {
        workRepository.save(work)
    }

    fun getWorksByUserId(id: Long?): List<Work> {
        return workRepository.findAllByAuthor_Id(id)
    }

}