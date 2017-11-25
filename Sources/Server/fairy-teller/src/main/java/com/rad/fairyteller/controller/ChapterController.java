package com.rad.fairyteller.controller;

import com.rad.fairyteller.service.ChapterService;
import com.rad.fairyteller.service.dto.chapterDto.ChapterDto;
import com.rad.fairyteller.service.mapper.ChapterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChapterController {
    private final ChapterService chapterService;
    private final ChapterMapper chapterMapper;

    @Autowired
    public ChapterController(ChapterService chapterService, ChapterMapper chapterMapper) {
        this.chapterService = chapterService;
        this.chapterMapper = chapterMapper;
    }

    @RequestMapping(path = "/getChapterById/{id}")
    public ChapterDto getPurchaseListByUserId(@PathVariable Long id) {
        return chapterMapper.toDto(chapterService.getChapterById(id));
    }
}
