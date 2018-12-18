package com.paula.info.Sekcja2;

public class Pajero extends Car {
	

	private String brand;
	private String model;
	private String engine;
	private Car car;
	
	
	public Pajero(String typeOfVehicle, boolean transportPeople, String unitBelongsTo, double weightKG, int wheels,
			int doors, String color, int seats, String brand, String model, String engine) {
		
		super(typeOfVehicle, transportPeople, unitBelongsTo, weightKG, wheels, doors, color, seats);
		this.brand = brand;
		this.model = model;
		this.engine = engine;
	}
	
	public Pajero() {
		System.out.println("Emtyp constructor Pajero called");
	}



	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Pajero [getBrand()=" + getBrand() + ", getModel()=" + getModel() + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", getDoors()=" + getDoors() + ", getColor()=" + getColor()
				+ ", getSeats()=" + getSeats() + ", getTypeOfVehicle()="
				+ getTypeOfVehicle() + ", isTransportPeople()=" + isTransportPeople() + ", getUnitBelongsTo()="
				+ getUnitBelongsTo() + ", getWeightKG()=" + getWeightKG() + "]";
	}


	

	
	
	
	

	
	
	
	
	
	

}
