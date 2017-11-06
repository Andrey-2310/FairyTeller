package com.rad.fairyteller.service;

import com.rad.fairyteller.domain.work.Work;
import com.rad.fairyteller.repository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkService {
    private final WorkRepository workRepository;

    @Autowired
    public WorkService(WorkRepository workRepository) {
        this.workRepository = workRepository;
    }

    public void saveOrUpdateWork(Work work){
        workRepository.save(work);
    }

    public List<Work> getWorksByUserId(Long id){
        return workRepository.findAllByAuthor_Id(id);
    }

}
