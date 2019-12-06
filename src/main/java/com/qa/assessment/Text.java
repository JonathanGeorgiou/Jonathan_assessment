package com.qa.assessment;

public class Text {

	private String intro = "Wlecome to a dark dark land in a dark dark place play the game and ......";
	private String distanceToGoal = "I think you are close to something intriguing...";
	private String distanceToTroll = "WARNING! Do not proceed in this direction! Something dangerous ";
	private String pick = "Do you go north (n), south (s), east (e), or west(w)... ";
	private String end = "Congratulations! You have found the treasure... let's hope it's not cursed.";
	private String gotcha = "Oh no! You have been devoured by the Troll!!! GAME OVER.";

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getTrollDistance() {
		return distanceToTroll;
	}

	public void setTrollDistance(String distanceToTroll) {
		this.distanceToTroll = distanceToTroll;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getGoalDistance() {
		return distanceToGoal;
	}

	public void setGoalDistance(String distanceToGoal) {
		this.distanceToGoal = distanceToGoal;
	}

	public String getPick() {
		return pick;
	}

	public void setPick(String pick) {
		this.pick = pick;
	}

	public String getGotcha() {
		return gotcha;
	}

	public void setGotcha(String gotcha) {
		this.gotcha = gotcha;
	}
}
