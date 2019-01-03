package com.paula.encapsulation;

public class Printer {

	private int tonerLevel = 0;
	private int numberPrintedPages;
	private boolean duplexPrinter = false;
	
	public Printer(int tonerLevel, boolean duplexPrinter) {
		
		if (tonerLevel >= 100) {
			this.tonerLevel = 100;
		} else if (tonerLevel <= 0) {
			this.tonerLevel = 0;
		} else
			this.tonerLevel = tonerLevel;
		
		this.numberPrintedPages = 0;
		this.duplexPrinter = duplexPrinter;
	}

	public void fillUpTheToner(int tonnerLevel) {
		
		if (tonerLevel == 100) {
			System.out.println("Toner level is: "+this.tonerLevel+"%");
		} else if (tonerLevel >= 0) {
			this.tonerLevel += tonnerLevel; 
			System.out.println("Toner level is: "+this.tonerLevel+"%");
		}
		
	}
	
	private int total;
	private	int var1 = 0;
	private	int var2 =0;
	
	public void printPage() {
		
		
		
		if(duplexPrinter==true) {
			System.out.println("Number of printed pages: "+2);
			var1++;
			
			
		}else {
			System.out.println("Number of printed pages: "+1);
			var2++;
		}
			total = (var1*2)+var2;
			
			this.numberPrintedPages = total;	
	}



	public int getNumberPrintedPages() {
		return numberPrintedPages;
	}
	
	
	
	
}
