package com.ufpa.cinerama.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufpa.cinerama.entities.Score;
import com.ufpa.cinerama.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
	
}
