
package com.snkldr;

public class SnakeLadUC3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int playerAPos = 0;
		int rollDie = (int)Math.floor(Math.random() * 10) % 6 + 1;
		int optCheck = (int)Math.floor(Math.random() * 10) % 3;
		final int noPlay = 0;
		final int ladder = 1;
		final int snake = 2;
		
		playerAPos += rollDie;
		System.out.println("Die rolled " + rollDie);
		
		switch (optCheck) {
		case noPlay:
			playerAPos = playerAPos;
			break;
		case ladder:
			playerAPos += rollDie;
			break;
		case snake:
			playerAPos -= rollDie;
			break;
		}
		
		System.out.println("Final postion of player is " + playerAPos);
	}

}
