package com.masai.strategy;

public class Player1 extends Fighter {

	public Player1(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
		super(kickBehavior, jumpBehavior);
	}

	@Override
	public void play() {
		System.out.println("Player 1");
	}

}
