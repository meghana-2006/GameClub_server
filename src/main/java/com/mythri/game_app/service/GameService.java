package com.mythri.game_app.service;

import com.mythri.game_app.entity.Game;
import com.mythri.game_app.repository.GameRepository;
// ...existing code...
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	public List<Game> getAllGames() {
		return gameRepository.findAll();
	}

	public Game getGameById(String id) {
		Optional<Game> game = gameRepository.findById(id);
		return game.orElse(null);
	}

	public Game createGame(Game game) {
		return gameRepository.save(game);
	}

	public Game updateGame(String id, Game game) {
		Optional<Game> existingGame = gameRepository.findById(id);
		if (existingGame.isPresent()) {
			Game g = existingGame.get();
			g.setName(game.getName());
			g.setPrice(game.getPrice());
			g.setDescription(game.getDescription());
			g.setStatus(game.getStatus());
			g.setDuration(game.getDuration());
			g.setMinimumPlayerCount(game.getMinimumPlayerCount());
			g.setMaximumPlayerCount(game.getMaximumPlayerCount());
			g.setPlayersCountMultiple(game.getPlayersCountMultiple());
			return gameRepository.save(g);
		} else {
			return null;
		}
	}

	public void deleteGame(String id) {
		gameRepository.deleteById(id);
	}
}
