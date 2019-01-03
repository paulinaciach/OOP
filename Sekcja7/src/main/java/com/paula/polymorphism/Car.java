package com.paula.polymorphism;

public class Car {
	
	private String type;
	private int wheels;
	private int cylinders;
	private boolean engine;
	
	
	
	public Car(String type, int cylinders) {
		
		this.type = type;
		this.wheels = 4;
		this.cylinders = cylinders;
		this.engine = true;
	}
	
	
	public String startEngine() {
		
		return "Starting engine";
		
	}
	
	public String brake() {
		
		return "Braking";
		
	}
	
	
	public String acceleate() {
		
		return "Speeding up";
		
	}


	public String getType() {
		return type;
	}


	public int getWheels() {
		return wheels;
	}


	public int getCylinders() {
		return cylinders;
	}


	public boolean isEngine() {
		return engine;
	}
	
	
	
	
}
