package com.rad.fairyteller.repository;

import com.rad.fairyteller.domain.work.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkRepository extends JpaRepository<Work, Long> {
    List<Work> findAllByAuthor_Id(Long id);
    List<Work> findTop5ByViewsLessThanOrderByViewsDesc(Integer from);
    List<Work> findTop5ByOrderByViewsDesc();
}
