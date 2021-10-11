package com.alper.lesson1;

public class Person {
	float height;
	float weight;
	
	//constructor
	public Person() {
		this.height =170;
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