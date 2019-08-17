package com.example.demo;

public class Wednesday {

	int degree;
	int celsius;
	String image;
	public int getDegree() {
		return degree;
	}
	public void setDegree(int degree) {
		this.degree = degree;
	}
	public Wednesday(int degree, int celsius, String image) {
		super();
		this.degree = degree;
		this.celsius = celsius;
		this.image = image;
	}
	public int getCelsius() {
		return celsius;
	}
	public void setCelsius(int celsius) {
		this.celsius = celsius;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
