
package com.snkldr;

public class SnakeLadUC6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int playerAPos = 0;
		int counter = 0;
		final int noPlay = 0;
		final int ladder = 1;
		final int snake = 2;

		while (playerAPos < 100) {
			int rollDie = (int) Math.floor(Math.random() * 10) % 6 + 1;
			int optCheck = (int) Math.floor(Math.random() * 10) % 3;
			playerAPos += rollDie;
			counter++;
			
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
			
			if(playerAPos > 100)
				playerAPos -= rollDie;
			else if(playerAPos < 0)
				playerAPos = 0;
			else if(playerAPos == 100)
			{
				System.out.println("Player won the game");
				System.out.println("Die was rolled " + counter + " times");
				break;
			}
			System.out.println("Final postion of player is " + playerAPos);
		}
	}

}