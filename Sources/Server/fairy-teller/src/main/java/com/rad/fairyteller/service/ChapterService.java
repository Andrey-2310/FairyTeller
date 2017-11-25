package com.rad.fairyteller.service;

import com.rad.fairyteller.domain.chapter.Chapter;
import com.rad.fairyteller.repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChapterService {
    private final ChapterRepository chapterRepository;

    @Autowired
    private ChapterService(ChapterRepository chapterRepository) {
        this.chapterRepository = chapterRepository;
    }

    public Chapter getChapterById(Long id) {
        return chapterRepository.findOne(id);
    }
}
