package com.rad.fairyteller.controller;

import com.rad.fairyteller.mapping.dto.ChapterDto;
import com.rad.fairyteller.service.ChapterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChapterController {

    private final ChapterService chapterService;

    @RequestMapping(path = "/getChapterById/{id}")
    public ChapterDto getPurchaseListByUserId(@PathVariable final Long id) {
        return chapterService.getChapterById(id);
    }
}
