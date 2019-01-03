package com.paula;

public class RiceSalad extends Salad {

	private String redBeans;
	private String rice; // brown/ jasmine
	private String kale; // addition
	private String onion; // addition
	private double price;

	public RiceSalad(String dressing, String redBeans,
			String rice)

	{
		super("no", "yes", "no", dressing);
		this.redBeans = redBeans;
		this.rice = rice;
		this.price = getPrice();

	}
	
	
	public String addOnion(String onion) {
		
		if(onion.toLowerCase().equals("yes")) {
		this.price = getPrice() + 2;
		System.out.println("Onion added. Additional charge is 2PLN. Total: "+this.price);
		}else
			System.out.println("Tomato not added. No additional charge. Total: "+this.price);
			
		return this.onion = onion;
		
	}


	@Override
	public String toString() {
		return "RiceSalad [redBeans=" + redBeans + ", rice=" + rice + ", kale=" + kale + ", onion=" + onion + ", price="
				+ price + "]";
	}
	
	
	
	
	
}
