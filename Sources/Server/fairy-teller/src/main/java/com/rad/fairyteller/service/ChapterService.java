package com.rad.fairyteller.service;

import com.rad.fairyteller.mapping.dto.ChapterDto;
import com.rad.fairyteller.mapping.mapper.ChapterMapper;
import com.rad.fairyteller.repository.ChapterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChapterService {

    private final ChapterMapper chapterMapper;
    private final ChapterRepository chapterRepository;

    public ChapterDto getChapterById(final Long id) {
        return chapterMapper.toDto(chapterRepository.findOne(id));
    }
}
