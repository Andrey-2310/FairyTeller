package com.rad.fairyteller.service.dto.chapterDto;

import com.rad.fairyteller.service.dto.unitDto.UnitDto;
import lombok.Data;

import java.util.List;
@Data
public class ChapterDto {
    private Long id;
    private String title;
    private Long innerId;
    private Long workId;
    private List<UnitDto> units;
}
