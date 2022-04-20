package com.ufpa.cinerama.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufpa.cinerama.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
