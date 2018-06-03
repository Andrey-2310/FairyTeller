package com.rad.fairyteller.service;

import com.rad.fairyteller.domain.book.Work;
import com.rad.fairyteller.mapping.dto.WorkDto;
import com.rad.fairyteller.mapping.mapper.WorkMapper;
import com.rad.fairyteller.repository.WorkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WorkService {

    private final WorkMapper workMapper;
    private final WorkRepository workRepository;

    public void saveOrUpdateWork(final Work work) {
        Optional.ofNullable(work).ifPresent(workRepository::save);
    }

    public List<WorkDto> getWorksByAuthorId(final Long id) {
        return workMapper.toDto(workRepository.findAllByAuthorId(id));
    }

    public List<WorkDto> getNextPopularWorks(final Integer from) {
        return workMapper.toDto(from.equals(-1) ? workRepository.findTop5ByOrderByViewsDesc()
                : workRepository.findTop5ByViewsLessThanOrderByViewsDesc(from));
    }
}
