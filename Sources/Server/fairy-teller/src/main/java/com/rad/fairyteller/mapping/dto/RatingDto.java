package com.rad.fairyteller.mapping.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RatingDto {
    private Long id;
    private Long workId;
    private Long userId;
    private int value;
}
