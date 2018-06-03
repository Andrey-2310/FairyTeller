package com.rad.fairyteller.service;

import com.rad.fairyteller.domain.book.Work;
import com.rad.fairyteller.repository.WorkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WorkService {

    private final WorkRepository workRepository;

    public void saveOrUpdateWork(final Work work) {
        Optional.ofNullable(work).ifPresent(workRepository::save);
    }

    public List<Work> getWorksByAuthorId(final Long id) {
        return workRepository.findAllByAuthorId(id);
    }

    public List<Work> getNextPopularWorks(final Integer from) {
        return from.equals(-1) ? workRepository.findTop5ByOrderByViewsDesc()
                : workRepository.findTop5ByViewsLessThanOrderByViewsDesc(from);
    }
}
