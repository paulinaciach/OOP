package com.paula;

public class Salad {
	
	private String name;
	private String quinoaType; //white, 3 colors
	private String cashewNuts; // yes or no
	private String fetaCheese; // yes or no
	private String dressing; // basil, tomato, noDressing, BBQ
	private double price ;//= 13.00; // basic price for the regular salad
	private String tomato = "no";
	private String cheackpea = "no";
	private String spinach = "no";
	
	
	public Salad(String quinoaType, String cashewNuts, String fetaCheese, String dressing) {
		
		this.name = "Basic Salad";
		this.quinoaType = quinoaType;
		this.cashewNuts = cashewNuts;
		this.fetaCheese = fetaCheese;
		this.dressing = dressing;
		this.price = 13.00;
	}
	
	
	public String addTomato(String tomato) {
		
		if(tomato.toLowerCase().equals("yes")) {
		this.price = this.price + 2;
		System.out.println("Tomato added. Additional charge is 2PLN. Total: "+this.price);
		}else
			System.out.println("Tomato not added. No additional charge. Total: "+this.price);
			
		return this.tomato = tomato;
		
	}


	public String addCheackpea(String cheackpea) {
		
		if(cheackpea.toLowerCase().equals("yes")) {
		this.price = this.price + 2;
		System.out.println("Cheackpea added. Additional charge is 2PLN. Total: "+this.price);
		}else
			System.out.println("Cheackpea not added. No additional charge. Total: "+this.price);
			
		return this.cheackpea = cheackpea;
		
	}

	public String addSpinach(String spinch) {
		
		if(spinch.toLowerCase().equals("yes")) {
		this.price = this.price + 2;
		System.out.println("Spinach added. Additional charge is 2PLN. Total: "+this.price);
		}else
			System.out.println("Spinach not added. No additional charge. Total: "+this.price);
			
		return this.spinach = spinch;
		
	}
	
	

	public double getPrice() {
		return this.price;
	}

	
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Salad [name=" + name + ", quinoaType=" + quinoaType + ", cashewNuts=" + cashewNuts + ", fetaCheese="
				+ fetaCheese + ", dressing=" + dressing + ", price=" + price + ", tomato=" + tomato + ", cheackpea="
				+ cheackpea + ", spinach=" + spinach + "]";
	}
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	

}
