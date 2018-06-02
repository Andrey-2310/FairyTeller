package com.rad.fairyteller.service.dto;

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
