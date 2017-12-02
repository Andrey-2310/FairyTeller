package com.rad.fairyteller.controller;

import com.rad.fairyteller.service.RatingService;
import com.rad.fairyteller.service.dto.ratingDto.RatingDto;
import com.rad.fairyteller.service.mapper.RatingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingController {
    private final RatingService ratingService;
    private final RatingMapper ratingMapper;

    @Autowired
    public RatingController(RatingService ratingService, RatingMapper ratingMapper) {
        this.ratingService = ratingService;
        this.ratingMapper = ratingMapper;
    }

    @RequestMapping(name = "rating/save", method = RequestMethod.POST)
    public void saveRating(@RequestParam RatingDto ratingDto){
        ratingService.saveRating(ratingMapper.toEntity(ratingDto));
    }
}
