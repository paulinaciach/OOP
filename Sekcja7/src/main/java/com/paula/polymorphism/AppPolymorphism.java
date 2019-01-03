package com.paula.polymorphism;

public class AppPolymorphism {

	public static void main(String[] args) {

//		BMW bmw = new BMW("X4", 8);
//
//		System.out.println(bmw.getName());
//		System.out.println(bmw.acceleate());
//
//		Lada lada = new Lada("Niva", 4);
//
//		System.out.println(lada.getName());
//		System.out.println(lada.acceleate());
//
//		Toyota toyota = new Toyota("CRV", 6);
//
//		System.out.println(toyota.getName());
//		System.out.println(toyota.acceleate());
//		
		Car car1 = new BMW("x5", 10);
		
		System.out.println(car1.acceleate());
		System.out.println(car1.brake());
		
		

	}

}
