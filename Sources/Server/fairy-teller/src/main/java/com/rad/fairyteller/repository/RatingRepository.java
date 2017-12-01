package com.rad.fairyteller.repository;

import com.rad.fairyteller.domain.rating.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findAllByWorkIdAndUserId(Long workId, Long userId);
}
