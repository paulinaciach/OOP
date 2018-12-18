package com.paula.info.Sekcja3;


/*
 * referencje do obiektów, obiekty, klasy, instancje obiektow
 * */

public class Bicycle {
	
	private int gear;
	private String color;
	
	
	
	
	public Bicycle(int gear, String color) {
		super();
		this.gear = gear;
		this.color = color;
	}




	public int getGear() {
	
		return gear;
	}




	public String getColor() {

		return color;
	}




	public void setGear(int gear) {
		this.gear = gear;
	}




	public void setColor(String color) {
		this.color = color;
	}




	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", color=" + color + "]";
	}
	
	
	
	
	

}
