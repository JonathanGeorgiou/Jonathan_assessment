package com.qa.assessment;

public class Text {

	private String intro = "Wlecome to a dark dark land in a dark dark place play the game and ......";
	private String distance = "I think you are close to something intriguing...";
	private String firstFeature;
	private String pick = "Do you go north (n), south (s), east (e), or west(w)... ";
	private String end = "Congratulations! You have found the treasure... let's hope it's not cursed.";

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getFirstFeature() {
		return firstFeature;
	}

	public void setFirstFeature(String firstFeature) {
		this.firstFeature = firstFeature;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getPick() {
		return pick;
	}

	public void setPick(String pick) {
		this.pick = pick;
	}
}
