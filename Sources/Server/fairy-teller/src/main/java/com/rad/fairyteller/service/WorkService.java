package com.rad.fairyteller.service;

import com.rad.fairyteller.domain.work.Work;
import com.rad.fairyteller.repository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class WorkService {
    private final WorkRepository workRepository;

    @Autowired
    public WorkService(WorkRepository workRepository) {
        this.workRepository = workRepository;
    }

    public void saveOrUpdateWork(Work work) {
        if(!Objects.isNull(work)) {
            workRepository.save(work);
        }
    }

    public List<Work> getWorksByAuthorId(Long id) {
        return workRepository.findAllByAuthor_Id(id);
    }

    public List<Work> getNextPopularWorks(Integer from) {
        return from.equals(-1) ? workRepository.findTop5ByOrderByViewsDesc() :
                workRepository.findTop5ByViewsLessThanOrderByViewsDesc(from);
    }
}
