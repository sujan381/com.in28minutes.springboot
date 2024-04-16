package com.in28minutes.learnspringframework.game;

public class BGMI implements GameConsole{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		
		System.out.println("Go up buddy");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		
		System.out.println("Crouch on the ground");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		
		System.out.println("Shoot Bullet buddy");
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		
		System.out.println("Run Fast buddy");
		
	}

}
