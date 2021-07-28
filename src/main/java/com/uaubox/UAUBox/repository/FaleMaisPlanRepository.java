package com.uaubox.UAUBox.repository;

import com.uaubox.UAUBox.entity.FaleMaisPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaleMaisPlanRepository extends JpaRepository<FaleMaisPlan, Long> {

    FaleMaisPlan findByOriginAndDestination(Integer origin, Integer destination);

}
