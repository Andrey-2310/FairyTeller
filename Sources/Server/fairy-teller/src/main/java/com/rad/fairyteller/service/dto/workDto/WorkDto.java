package com.rad.fairyteller.service.dto.workDto;

import com.rad.fairyteller.service.dto.chapterDto.ChapterDto;
import lombok.Data;

import java.util.List;

@Data
public class WorkDto {
    private Long id;
    private String authorName;
    private String title;
    private List<ChapterDto> chapters;
}
