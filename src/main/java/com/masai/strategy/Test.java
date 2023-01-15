package com.masai.strategy;

public class Test {

	public static void main(String[] args) {
		JumpBehavior shortJump = new ShortJump();
		JumpBehavior longJump = new LongJump();
		KickBehavior tornadoKick = new TornadoKick();
		Fighter player1 = new Player1(tornadoKick,shortJump);
		Fighter player2 = new Player2(tornadoKick,longJump);
		player1.play();
		player1.punch();
		player1.kick();
		player1.jump();
		player2.play();
		player2.roll();
		player2.jump();
		player2.kick();
	}

}
