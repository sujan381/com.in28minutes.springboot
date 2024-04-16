package com.in28minutes.learnspringframework.SpringGame;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BGMI implements GamingConsole{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Go up in BGMI");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Go down in BGMI");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		
		System.out.println("Go left in BGMI");
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Go right in BGMI");
	}

}
