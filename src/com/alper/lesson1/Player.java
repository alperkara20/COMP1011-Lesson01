package com.alper.lesson1;

public class Player {
	
	public static void main(String[] args) {
		int year = 2021;
		
		System.out.println("Hello World! It's " + year);
		Person tom = new Person("Maxy", 70, 174);
		tom.walks();
		tom.walks();
		tom.walks();
		tom.setHeight(175);

	}
		

}
