package com.in28minutes.learnspringframework.SpringGame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	@Autowired
	GamingConsole game;
	
	/*GameRunner(@Qualifier("marioGame")GamingConsole game)
	{
		this.game = game;
	}*/
	
	public void run()
	{
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
