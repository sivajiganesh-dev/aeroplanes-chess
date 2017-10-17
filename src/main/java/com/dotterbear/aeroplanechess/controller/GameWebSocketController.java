package com.dotterbear.aeroplanechess.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

import com.dotterbear.aeroplanechess.service.impl.GameServiceImpl;

@Controller
public class GameWebSocketController {

	@Autowired
	GameServiceImpl gameService;

	Logger logger = LoggerFactory.getLogger(GameWebSocketController.class);

	@MessageMapping("/roll/{gameId}")
	public void roll(@Header("simpSessionId") String sessionId, @DestinationVariable("gameId") String gameId) {
		gameService.roll(sessionId, gameId);
	}

	@MessageMapping("/move/{gameId}/{aeroplaneIndex}")
	public void move(@Header("simpSessionId") String sessionId, @DestinationVariable("gameId") String gameId, @DestinationVariable("aeroplaneIndex") int aeroplaneIndex) {
		gameService.move(sessionId, gameId, aeroplaneIndex);
	}
}