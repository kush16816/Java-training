
package com.snkldr;

public class SnakeLadUC7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int playerAPos = 0;
		int playerBPos = 0;
		int counter = 0;
		int winCheck = 0;
		int checkTurn = 0;
		final int noPlay = 0;
		final int ladder = 1;
		final int snake = 2;

		while(winCheck == 0)
		{
			while (playerAPos < 100 && checkTurn == 0) {
				int rollDie = (int) Math.floor(Math.random() * 10) % 6 + 1;
				int optCheck = (int) Math.floor(Math.random() * 10) % 3;
				playerAPos += rollDie;
				counter++;
				
				switch (optCheck) {
				case noPlay:
					checkTurn = 1;
					break;
				case ladder:
					playerAPos += rollDie;
					break;
				case snake:
					playerAPos -= rollDie;
					checkTurn = 1;
					break;
				}
				
				if(playerAPos > 100)
					playerAPos -= rollDie;
				else if(playerAPos < 0)
					playerAPos = 0;
				else if(playerAPos == 100)
				{
					System.out.println("Player A won the game");
					System.out.println("Die was rolled " + counter + " times");
					winCheck = 1;
					break;
				}
				System.out.println("Final postion of player A is " + playerAPos);
			}
			
			if(winCheck == 1)
				break;
			
			while (playerBPos < 100 && checkTurn == 1) {
				int rollDie = (int) Math.floor(Math.random() * 10) % 6 + 1;
				int optCheck = (int) Math.floor(Math.random() * 10) % 3;
				playerBPos += rollDie;
				counter++;
				
				switch (optCheck) {
				case noPlay:
					checkTurn = 0;
					break;
				case ladder:
					playerBPos += rollDie;
					break;
				case snake:
					playerBPos -= rollDie;
					checkTurn = 0;
					break;
				}
				
				if(playerBPos > 100)
					playerBPos -= rollDie;
				else if(playerBPos < 0)
					playerBPos = 0;
				else if(playerBPos == 100)
				{
					System.out.println("Player B won the game");
					System.out.println("Die was rolled " + counter + " times");
					winCheck = 1;
					break;
				}
				

				if(winCheck == 1)
					break;
				System.out.println("Final postion of player B is " + playerAPos);
			}
		}
	}
}