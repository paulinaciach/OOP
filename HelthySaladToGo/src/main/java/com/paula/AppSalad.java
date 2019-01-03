package com.paula;

public class AppSalad {

	public static void main(String[] args) {
		
		
		Salad salad = new Salad("mixed", "yes", "yes", "basil");
	//	String quinoaType, String cashewNuts, String fetaCheese, String dressing
		
		
		
//		System.out.println(salad.toString());
//		salad.addTomato("yes");
//		System.out.println(salad.toString());
//		salad.addCheackpea("yes");
//		System.out.println(salad.toString());
//		salad.addSpinach("yes");
//		System.out.println(salad.toString());
//		
		
//		
//		RiceSalad riceSalad = new RiceSalad("basil", "yes", "brown");
//		
//		System.out.println(riceSalad.toString());
//		riceSalad.addCheackpea("yes");
//		riceSalad.addSpinach("yes");
//		System.out.println(riceSalad.getPrice());
//		
//		riceSalad.addOnion("yes");
//		
		
		
		DeluxeSalad greenDeluxeSalad = new DeluxeSalad("basil", "yes", "yes");
		
		System.out.println(greenDeluxeSalad.toString());
		
		greenDeluxeSalad.setDrink("tea");

		System.out.println(greenDeluxeSalad.toString());
		
		System.out.println(greenDeluxeSalad.addCheackpea("yes"));
		
		
		
		System.out.println(greenDeluxeSalad.getName());
	}
	
	
	
	
}
