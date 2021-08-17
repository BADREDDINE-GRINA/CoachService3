package com.transformation.coachservice3.dao;

import com.transformation.coachservice3.entities.Coach;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoachRepository extends JpaRepository<Coach,Long> {
}
