package com.rad.fairyteller.controller;

import com.rad.fairyteller.service.ChapterService;
import com.rad.fairyteller.service.dto.ChapterDto;
import com.rad.fairyteller.service.mapper.ChapterMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChapterController {

    private final ChapterService chapterService;
    private final ChapterMapper chapterMapper;

    @RequestMapping(path = "/getChapterById/{id}")
    public ChapterDto getPurchaseListByUserId(@PathVariable final Long id) {
        return chapterMapper.toDto(chapterService.getChapterById(id));
    }
}
