package com.qa.assessment;

import java.util.Scanner;

public class Game {

	Feature goal = new Feature("Treasure", (Math.random() * 10), (Math.random() * 10));
	Feature troll = new Feature("Troll", (Math.random() * 10), (Math.random() * 10));

	Player player1 = new Player();
	Text text = new Text();

	public void move() {

		Scanner d = new Scanner(System.in);
		System.out.println(text.getPick());
		String direction = d.nextLine();

		if (direction.equalsIgnoreCase("n")) {
			double playerY = player1.getYPosition() + 1;
			player1.setYPosition(playerY);
			this.compass();
		}
		if (direction.equalsIgnoreCase("e")) {
			double playerX = player1.getXPosition() + 1;
			player1.setXPosition(playerX);
			this.compass();
		}
		if (direction.equalsIgnoreCase("s")) {
			double playerY = player1.getYPosition() - 1;
			player1.setYPosition(playerY);
			this.compass();
		}
		if (direction.equals("w")) {
			double playerX = player1.getXPosition() - 1;
			player1.setXPosition(playerX);
			this.compass();
		} else {
			System.out.println("Sorry that is not a correct move. GAME OVER.");
			d.close();

		}

	}

	public void compass() {

		double distance = Math.hypot((player1.getXPosition() - goal.getxVal()),
				(player1.getYPosition() - goal.getxVal()));
		System.out.println(text.getDistance() + distance + "m away.");
		while (distance >= 1.0) {
			this.move();
		}
		if (distance < 1.0) {
			System.out.println(text.getEnd());
		}

	}

}
