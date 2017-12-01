package com.rad.fairyteller.controller;

import com.rad.fairyteller.domain.rating.Rating;
import com.rad.fairyteller.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingController {
    private final RatingService ratingService;

    @Autowired
    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @RequestMapping(name = "rating/save", method = RequestMethod.POST)
    public void saveRating(@RequestParam Rating rating){
        ratingService.saveRating(rating);
    }
}
