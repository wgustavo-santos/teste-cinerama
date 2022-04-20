package com.ufpa.cinerama.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ufpa.cinerama.dto.MovieDTO;
import com.ufpa.cinerama.dto.ScoreDTO;
import com.ufpa.cinerama.entities.Movie;
import com.ufpa.cinerama.entities.Score;
import com.ufpa.cinerama.entities.User;
import com.ufpa.cinerama.repositories.MovieRepository;
import com.ufpa.cinerama.repositories.ScoreRepository;
import com.ufpa.cinerama.repositories.UserRepository;

@Service
public class ScoreService {

	@Autowired
	public MovieRepository movieRepository;
	
	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	public ScoreRepository scoreRepository;
	
	@Transactional
	public MovieDTO saveScore (ScoreDTO dto) {
		User user = userRepository.findByEmail(dto.getEmail()); /* Recuperar user pelo email */
		
		if( user == null) { /* Caso email não exista, criar novo user no banco */
			user = new User();
			user.setEmail(dto.getEmail());
			user = userRepository.saveAndFlush(user); /* Pode usar o save() mas por garantia, usar saveAndFlush p/ retornar obj atualizado */
		}
		
		Movie movie = movieRepository.findById(dto.getMovieId()).get();
		Score score = new Score();
		
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(dto.getScore());
		score = scoreRepository.saveAndFlush(score);
		
		double sum = 0.0;
		for (Score s : movie.getScores())
			sum += s.getValue();
		double avg = sum / movie.getScores().size();
		
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		movie = movieRepository.save(movie);
		
		return new MovieDTO(movie);
		
	}
	
	
}
