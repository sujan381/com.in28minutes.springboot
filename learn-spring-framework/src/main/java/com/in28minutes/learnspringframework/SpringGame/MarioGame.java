package com.in28minutes.learnspringframework.SpringGame;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("marioGame")
public class MarioGame implements GamingConsole{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Go up in MarioGame");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Go down in MarioGame");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		
		System.out.println("Go left in MarioGame");
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		
		System.out.println("Go right in MarioGame");
		
	}

}
