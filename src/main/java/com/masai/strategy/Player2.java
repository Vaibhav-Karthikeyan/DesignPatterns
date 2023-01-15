package com.masai.strategy;

public class Player2 extends Fighter{

	public Player2(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
		super(kickBehavior, jumpBehavior);
	}

	@Override
	public void play() {
		System.out.println("Player 2");
		
	}

}
