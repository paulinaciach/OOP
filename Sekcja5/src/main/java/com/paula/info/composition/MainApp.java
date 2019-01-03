package com.paula.info.composition;

public class MainApp {

	
		public static void main(String[] args) {
			
			
			Dimensions dimensions = new Dimensions(322, 435, 34);
			
			Case theCase = new Case("333","Dell","240",dimensions);
			
			Monitor theMonitor = new Monitor("27 inch Beast", "Acer",
					23, new Resolution(323, 433));
			
			
			Motherboard motherboard = new Motherboard("43-43",
					"Asus", 4, 5, "v.44");
			
			PC thePC = new PC(theCase, theMonitor, motherboard);
			
			thePC.getMonitor().drawPixelAt(44, 44, "blue");
			
			System.out.println(thePC);
			
			thePC.getMotherboard().loadProgram("LOL");
			
		}
	
	
}
