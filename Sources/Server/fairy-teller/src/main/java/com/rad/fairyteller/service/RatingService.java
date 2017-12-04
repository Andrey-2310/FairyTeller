package com.rad.fairyteller.service;

import com.rad.fairyteller.domain.rating.Rating;
import com.rad.fairyteller.repository.RatingRepository;
import com.rad.fairyteller.repository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class RatingService {
    private final RatingRepository ratingRepository;
    private final WorkRepository workRepository;

    private final int RATING_LOWER_BORDER = 1;
    private final int RATING_UPPER_BORDER = 5;


    @Autowired
    public RatingService(RatingRepository ratingRepository, WorkRepository workRepository) {
        this.ratingRepository = ratingRepository;
        this.workRepository = workRepository;
    }

    public void saveRating(Rating rating) {
        if (!Objects.isNull(rating) &&
                rating.getValue() >= RATING_LOWER_BORDER &&
                rating.getValue() <= RATING_UPPER_BORDER) {
            Rating existingRating = isThereExistingRating(rating);
            if (Objects.isNull(existingRating)) {
                workRepository.addRatingToWork(rating.getWork().getId(), rating.getValue());
            } else {
                workRepository.addRatingToWork(rating.getWork().getId(),
                        rating.getValue() - existingRating.getValue());
                ratingRepository.delete(existingRating);
            }
            ratingRepository.save(rating);
        }
    }

    private Rating isThereExistingRating(Rating rating) {
        return ratingRepository.findAllByWorkIdAndUserId(
                rating.getWork().getId(), rating.getUser().getId()).get(0);
    }
}