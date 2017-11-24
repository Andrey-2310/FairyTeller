package com.rad.fairyteller.repository;

import com.rad.fairyteller.domain.unit.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Long>{
}
