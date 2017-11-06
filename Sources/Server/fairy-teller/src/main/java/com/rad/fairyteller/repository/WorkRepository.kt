package com.rad.fairyteller.repository

import com.rad.fairyteller.domain.work.Work
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface WorkRepository : JpaRepository<Work, Long> {
    fun findAllByAuthor_Id(id: Long?): List<Work>
}