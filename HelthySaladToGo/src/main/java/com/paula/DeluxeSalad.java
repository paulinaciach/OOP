package com.paula;

public class DeluxeSalad extends Salad {

	
	private String drink = "yes"; // orange juice, water, apple juice, tea, coffee
	private String chips = "yes"; // 
	private double price;
	
	
	
	public DeluxeSalad(String dressing, String drink,
			String chips) {
		super("yes", "yes", "yes", dressing);
		this.drink = drink;
		this.chips = chips;
		this.price = 21.00;
	}




	@Override
	public String getName() {
		return DeluxeSalad.class.getSimpleName();
	}




	public void setDrink(String drink) {
		this.drink = drink;
	}

	

	@Override
	public String addTomato(String tomato) {
		return "no allowed in this meal to add tomato";
	}




	@Override
	public String addCheackpea(String cheackpea) {
		return "no allowed in this meal to add cheackpea";
	}




	@Override
	public String addSpinach(String spinch) {
		return "no allowed in this meal to add spinach";
	}




	@Override
	public String toString() {
		return "DeluxeSalad [drink=" + drink + ", chips=" + chips + ", price=" + price + "]";
	}


		

	
	
	
	
	
	
}
