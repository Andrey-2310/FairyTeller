package com.rad.fairyteller.service.dto.chapterDto;

import com.rad.fairyteller.service.dto.UnitDto.UnitDto;
import lombok.Data;

import java.util.List;
@Data
public class ChapterDto {
    private Long id;
    private String title;
    private List<UnitDto> units;
}
