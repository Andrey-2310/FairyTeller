package com.rad.fairyteller.service;

import com.rad.fairyteller.domain.book.Chapter;
import com.rad.fairyteller.repository.ChapterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChapterService {

    private final ChapterRepository chapterRepository;

    public Chapter getChapterById(Long id) {
        return chapterRepository.findOne(id);
    }
}
