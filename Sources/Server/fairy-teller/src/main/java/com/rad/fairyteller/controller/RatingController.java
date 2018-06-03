package com.rad.fairyteller.controller;

import com.rad.fairyteller.mapping.dto.RatingDto;
import com.rad.fairyteller.service.RatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class RatingController {

    private final RatingService ratingService;

    @PostMapping(name = "rating/save")
    public void saveRating(@RequestBody final RatingDto ratingDto) {
        ratingService.saveRating(ratingDto);
    }
}
