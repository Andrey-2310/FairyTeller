package com.rad.fairyteller.mapping.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
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
