package com.rad.fairyteller.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ChapterDto {
    private Long id;
    private String title;
    private Long innerId;
    private Long workId;
    private List<UnitDto> units;
}
