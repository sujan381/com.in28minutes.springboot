package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.BGMI;
import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacMan;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		//MarioGame game = new MarioGame();
		
		//PacMan game = new PacMan();
		
		BGMI game = new BGMI();
		GameRunner gameRunner = new GameRunner(game);
		gameRunner.run();
		
	}

}
