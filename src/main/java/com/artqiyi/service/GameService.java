package com.artqiyi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.artqiyi.dao.mapper.GameMapper;
import com.artqiyi.dao.mapper.GamePkMapper;
import com.artqiyi.dao.model.Game;
import com.artqiyi.dao.model.GamePk;

@Service
public class GameService {
	@Autowired
	private GameMapper gameMapper;
	
	@Autowired
	private GamePkMapper gamePkMapper;
	
	@Transactional
	@Cacheable("game")
	public Game addGamePk() {
		Game game = new Game();
		game.setGameName("大话骰");
		game.setRemark("闯关游戏");
		game.setSort((short)1);
		
		gameMapper.insert(game);
		GamePk gamePk = new GamePk();
		gamePk.setUserId(3L);
		gamePk.setRivalUserId(4L);
//		if(gamePk.getUserId()!=null) {
//			throw new RuntimeException("事务测试");
//		}
		gamePkMapper.insert(gamePk );
		return game;
	}
}
