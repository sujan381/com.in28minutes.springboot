package com.in28minutes.learnspringframework.game;

public class MarioGame implements GameConsole {
	
	public void up()
	{
		System.out.println("Jump");
	}
	public void down()
	{
		System.out.println("Bent down");
	}
	public void left()
	{
		System.out.println("Go Left");
	}
	public void right()
	{
		System.out.println("Go Right");
	}

}
