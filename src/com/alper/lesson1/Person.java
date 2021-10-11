package com.alper.lesson1;

public class Person {
	private float height;
	private float weight;
	
	//Getters n setters
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	//constructor
	public Person() {
		this.setHeight(170);
		this.weight =65;
	}
	
	public void walks() {
		this.weight *= 0.9;
		System.out.println("Ya lost weight. New weight: " + this.weight + " kgs.");
	}
	
	public void eats() {
		this.weight *= 1.2;
		System.out.println("Ya gained weight. New weight: " + this.weight);
	}
}