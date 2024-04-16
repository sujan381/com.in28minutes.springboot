package com.in28minutes.learnspringframework.game;

public class GameRunner {
	
	//MarioGame game;

	/*public GameRunner(MarioGame marioGame) {
		this.game = marioGame;
	}*/

   private GameConsole game;

	public GameRunner(GameConsole game) {
	this.game = game;
}

	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(game);
		
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
