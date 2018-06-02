package com.rad.fairyteller.repository;

import com.rad.fairyteller.domain.book.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface WorkRepository extends JpaRepository<Work, Long> {
    List<Work> findAllByAuthor_Id(Long id);

    List<Work> findTop5ByViewsLessThanOrderByViewsDesc(Integer from);

    List<Work> findTop5ByOrderByViewsDesc();

    @Transactional
    @Modifying
    @Query("UPDATE Work work " +
            "SET work.rating = work.rating + :newRate " +
            "WHERE  work.id = :id")
    void addRatingToWork(@Param("id") Long id, @Param("newRate") int newRate);
}
