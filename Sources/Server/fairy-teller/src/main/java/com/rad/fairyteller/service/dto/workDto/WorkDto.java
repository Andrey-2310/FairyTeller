package com.rad.fairyteller.service.dto.workDto;

import lombok.Data;

import java.util.List;

@Data
public class WorkDto {
    private Long id;
    private Integer views;
    private Integer rating;
    private String authorName;
    private Integer year;
    private List<String> genres;
    private String title;
    private String description;
    private Integer pagesAmount;
    private String coverImagePath;
    private String language;
}
