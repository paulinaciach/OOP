package com.paula.polymorphism;

public class BMW extends Car {


	private String name;
	private int maxSpeed;
	
	
	public BMW(String type, int cylinders) {
		super(type, cylinders);
		this.maxSpeed = 220;
		this.name = BMW.class.getSimpleName();
		
	}
	
	

	public String getName() {
		return name;
	}



	public String acceleate() {
		
		return "Speeding up. Max speed: "+maxSpeed;
		
	}
	

	public String brake() {
		
		return "Braking in BMW";
		
	}
}
