package com.qa.assessment;

public class App {

	public static void main(String[] args) {

		Text a = new Text();
		Game play = new Game();
		play.goal.setxVal(Math.random() * 10);
		play.goal.setyVal(Math.random() * 10);

		System.out.println(a.getIntro());
		System.out.println();

		play.move();

	}

}
