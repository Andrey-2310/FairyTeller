package com.rad.fairyteller.service.dto.ratingDto;

import lombok.Data;

@Data
public class RatingDto {
    private Long id;
    private Long workId;
    private Long userId;
    private int value;
}
