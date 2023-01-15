package com.masai.strategy;

public abstract class Fighter {
	private KickBehavior kickBehavior;
	private JumpBehavior jumpBehavior;

	public Fighter(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
		super();
		this.jumpBehavior = jumpBehavior;
		this.kickBehavior = kickBehavior;
	}

	public void punch() {
		System.out.println("Default punch!");
	}

	public void roll() {
		System.out.println("Default roll...");
	}

	public void jump() {
		jumpBehavior.jump();
	}

	public void kick() {
		kickBehavior.kick();
	}
	public abstract void play();
}
