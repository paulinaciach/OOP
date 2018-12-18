package com.paula.info.Sekcja2;

public class Vehicle {

	private String typeOfVehicle; //car, aircraft, lorry, ferry, bike, bicycle, etc.
	private boolean transportPeople = true; // if transport people, then true, if cargo false
	private String unitBelongsTo; //private, army, public
	private double weightKG; // weight in KG
	
	
	public Vehicle(String typeOfVehicle, boolean transportPeople, String unitBelongsTo, double weightKG) {
		
		this.typeOfVehicle = typeOfVehicle;
		this.transportPeople = transportPeople;
		this.unitBelongsTo = unitBelongsTo;
		this.weightKG = weightKG;
	}
	
	
	public Vehicle() {
		
		System.out.println("Emtyp called Vehicle");
	
	}
	
	
	public void sound() {
		System.out.println("uuuuuuuuuuuuu");
	}

	
	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}


	public void setTransportPeople(boolean transportPeople) {
		this.transportPeople = transportPeople;
	}


	public void setUnitBelongsTo(String unitBelongsTo) {
		this.unitBelongsTo = unitBelongsTo;
	}


	public void setWeightKG(double weightKG) {
		this.weightKG = weightKG;
	}


	public String getTypeOfVehicle() {
		System.out.println("Type: "+typeOfVehicle);
		return typeOfVehicle;
	}
	public boolean isTransportPeople() {
		
		if(transportPeople==true) {
			System.out.println("This Vehicle transports people");
		}else System.out.println("This is cargo transport");
		
		return transportPeople;
	}
	public String getUnitBelongsTo() {
		System.out.println("This unit belongs to: "+unitBelongsTo);
		return unitBelongsTo;
	}
	public double getWeightKG() {
		System.out.println("Weight of ths vehicle: "+weightKG+"KG. ");
		return weightKG;
	}


	
	
	
}
