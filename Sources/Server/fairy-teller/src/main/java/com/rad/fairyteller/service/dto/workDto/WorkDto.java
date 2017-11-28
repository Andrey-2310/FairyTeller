package com.rad.fairyteller.service.dto.workDto;

import lombok.Data;

@Data
public class WorkDto {
    private Long id;
    private int views;
    private Long authorId;
    private String description;
    private String title;
    private String coverImagePath;
}
