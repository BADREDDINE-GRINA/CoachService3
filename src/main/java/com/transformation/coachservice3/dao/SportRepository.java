package com.transformation.coachservice3.dao;

import com.transformation.coachservice3.entities.Sport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportRepository extends JpaRepository<Sport,Long> {
}
