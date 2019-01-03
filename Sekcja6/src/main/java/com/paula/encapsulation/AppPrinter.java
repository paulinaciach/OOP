package com.paula.encapsulation;

public class AppPrinter {

	public static void main(String[] args) {
		
		Printer printer = new Printer(0, true);
		
		
		printer.fillUpTheToner(23);
		
		//printer.printTotal();
	
		printer.printPage();
		
		printer.printPage();
	//	printer.printTotal();
		System.out.println(printer.getNumberPrintedPages());	
		printer.printPage();
		
		printer.printPage();
		
		printer.printPage();
		
	//	printer.printTotal();
		
		System.out.println(printer.getNumberPrintedPages());	
		
	}
	
	
	
}
