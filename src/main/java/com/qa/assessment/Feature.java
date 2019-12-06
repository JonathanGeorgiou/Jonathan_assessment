package com.qa.assessment;

public class Feature {

	private double xVal;
	private double yVal;
	private String name;

	public Feature(String name, double xVal, double yVal) {
		super();
		this.xVal = xVal;
		this.yVal = yVal;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getxVal() {
		return xVal;
	}

	public void setxVal(double xVal) {
		this.xVal = xVal;
	}

	public double getyVal() {
		return yVal;
	}

	public void setyVal(double yVal) {
		this.yVal = yVal;
	}

}
