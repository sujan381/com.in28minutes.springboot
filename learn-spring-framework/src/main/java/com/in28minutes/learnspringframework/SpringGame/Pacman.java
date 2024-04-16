package com.in28minutes.learnspringframework.SpringGame;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pacMan")
public class Pacman implements GamingConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Go up in pacMan");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		
		System.out.println("Go down in pacMan");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		
		System.out.println("Go Left in PackMan");
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		
		System.out.println("Go Right in PacMan");
		
	}


}
