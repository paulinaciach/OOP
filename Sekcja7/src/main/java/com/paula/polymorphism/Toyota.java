package com.paula.polymorphism;

public class Toyota extends Car {
	
	
	private String name;
	private int maxSpeed;
	
	
	
	public Toyota(String type, int cylinders) {
		super(type, cylinders);
		this.maxSpeed = 180;
		this.name = Toyota.class.getSimpleName();
		
	}
	
	
	public String acceleate() {
		
		return "Speeding up. Max speed: "+maxSpeed;
		
	}


	public String getName() {
		
		return this.name;
	}
	
	
	
	
	
	
	
	
}
