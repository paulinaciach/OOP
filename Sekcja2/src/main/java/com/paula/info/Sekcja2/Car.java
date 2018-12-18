package com.paula.info.Sekcja2;

public class Car extends Vehicle {

	
	private int wheels; // how many wheels has this Car
	private int doors; // doors count
	private String color; // color of the car
	private int seats; // how many seats has this car
	


	public Car(String typeOfVehicle, boolean transportPeople, String unitBelongsTo, double weightKG, int wheels,
			int doors, String color, int seats)
	{
		super("Car", transportPeople, unitBelongsTo, weightKG);
		this.wheels = wheels;
		this.doors = doors;
		this.color = color;
		this.seats = seats;
		
		System.out.println("Empty Car");
	}
	
	public Car(String typeOfVehicle, boolean transportPeople, String unitBelongsTo, double weightKG)
	{
		super("Car", transportPeople, unitBelongsTo, weightKG);
		
		System.out.println("Empty Car");
	}


	public Car()
	{
		
		System.out.println("Nothing in");
	}
	
	

	@Override
	public void sound() {
		System.out.println("beeep-beeep");
		super.sound();
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}



	public void setDoors(int doors) {
		this.doors = doors;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public void setSeats(int seats) {
		this.seats = seats;
	}
	

	public int getWheels() {
		return wheels;
	}



	public int getDoors() {
		return doors;
	}



	public String getColor() {
		return color;
	}



	public int getSeats() {
		return seats;
	}









}
