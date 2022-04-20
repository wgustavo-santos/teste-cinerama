package com.ufpa.cinerama.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufpa.cinerama.dto.MovieDTO;
import com.ufpa.cinerama.dto.ScoreDTO;
import com.ufpa.cinerama.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService scoreService;
	
	@PutMapping
	public MovieDTO saveScore (@RequestBody ScoreDTO dto){/* Corpo da requisição */
		
		MovieDTO movieDTO = scoreService.saveScore(dto);
		
		return movieDTO;
	}

}
