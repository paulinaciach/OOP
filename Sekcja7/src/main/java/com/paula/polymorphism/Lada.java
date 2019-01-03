package com.paula.polymorphism;

public class Lada extends Car{


	private String name;
	private int maxSpeed;
	
	public Lada(String type, int cylinders) {
		super(type, cylinders);
		this.maxSpeed = 140;
		this.name = Lada.class.getSimpleName();
		
	}

	public String getName() {
		
		return this.name;
	}
}
