package com.alper.lesson1;

public class Person {
	private float height;
	private float weight;
	private String name;
	
	//Getters n setters
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	//constructor
	public Person(String name, float weight, float height) {
		this.name = name;
		this.height = height;	
		this.weight = weight;
	}
	
	public void walks() {
		this.weight *= 0.9;
		System.out.println(this.name + " lost weight. New weight: " + this.weight + " kgs.");
	}
	
	public void eats() {
		this.weight *= 1.2;
		System.out.println(this.name + " lost weight. New weight: " + this.weight);
	}
}
