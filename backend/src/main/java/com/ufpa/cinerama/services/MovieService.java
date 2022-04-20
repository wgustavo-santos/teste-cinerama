package com.ufpa.cinerama.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ufpa.cinerama.dto.MovieDTO;
import com.ufpa.cinerama.entities.Movie;
import com.ufpa.cinerama.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	public MovieRepository movieRepository;
	
	@Transactional(readOnly = true) /* Eficiencia no banco de dados */
	public Page<MovieDTO> findAll(Pageable pageable){
		/* Pageable para consulta no banco com paginação */
		Page<Movie> result = movieRepository.findAll(pageable);
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true) /* Eficiencia no banco de dados */
	public MovieDTO findById(Long id){
		/* Pageable para consulta no banco com paginação */
		Movie result = movieRepository.findById(id).get();
		MovieDTO dto = new MovieDTO(result);
		return dto;
	}
}
