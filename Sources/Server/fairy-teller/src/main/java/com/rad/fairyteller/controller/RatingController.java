package com.rad.fairyteller.controller;

import com.rad.fairyteller.service.RatingService;
import com.rad.fairyteller.service.dto.RatingDto;
import com.rad.fairyteller.service.mapper.RatingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class RatingController {

    private final RatingService ratingService;
    private final RatingMapper ratingMapper;

    @RequestMapping(name = "rating/save", method = RequestMethod.POST)
    public void saveRating(@RequestBody RatingDto ratingDto){
        ratingService.saveRating(ratingMapper.toEntity(ratingDto));
    }
}
