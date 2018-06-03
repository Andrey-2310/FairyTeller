package com.rad.fairyteller.service;

import com.rad.fairyteller.domain.book.Rating;
import com.rad.fairyteller.repository.RatingRepository;
import com.rad.fairyteller.repository.WorkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

@Service
@RequiredArgsConstructor
public class RatingService {

    private final RatingRepository ratingRepository;
    private final WorkRepository workRepository;

    private static final int RATING_LOWER_BORDER = 1;
    private static final int RATING_UPPER_BORDER = 5;

    @Transactional
    public void saveRating(final Rating rating) {
        if (nonNull(rating) && isRatingValid(rating)) {
            final Rating existingRating = isThereExistingRating(rating);
            workRepository.addRatingToWork(rating.getWork().getId(),
                    isNull(existingRating) ? rating.getValue()
                            : rating.getValue() - existingRating.getValue());
            Optional.ofNullable(existingRating).ifPresent(ratingRepository::delete);
            ratingRepository.save(rating);
        }
    }

    private boolean isRatingValid(final Rating rating) {
        return rating.getValue() >= RATING_LOWER_BORDER && rating.getValue() <= RATING_UPPER_BORDER;
    }

    private Rating isThereExistingRating(final Rating rating) {
        return ratingRepository.findAllByWorkIdAndUserId(
                rating.getWork().getId(), rating.getUser().getId()).get(0);
    }
}
