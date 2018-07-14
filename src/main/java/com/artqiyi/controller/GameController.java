package com.artqiyi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artqiyi.service.GameService;

@RestController
@RequestMapping("/game")
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping("/add")
	private String addGame() {
		gameService.addGamePk();
		return "good job";
	}
}
