package com.paula.info.Sekcja3;

public class Main {

	   public static void main( String[] args )
	    {
		   
		   Bicycle trek = new Bicycle(7, "black");
		   
		   Bicycle trekXV = trek;
		   
		   System.out.println("trek:" +trek);
		   System.out.println("trekXV:" +trekXV);
		   
		   System.out.println("*************************");
		   System.out.println("Modification of trek XV");
		   System.out.println("*************************");
		   
		   trekXV.setColor("Organge with black ornaments");
		   
		   System.out.println("trek:" +trek);
		   System.out.println("trekXV:" +trekXV);
		   
		   System.out.println("*************************");
		   System.out.println("New bicycle");
		   System.out.println("*************************");
		   
		   
		   Bicycle bianchi = new Bicycle(9, "celeste");
		   
		   System.out.println("bianchi: "+bianchi);
		
		   System.out.println("*************************");
		   System.out.println("trekXV = bianchi");
		   System.out.println("*************************");
		   
		   trekXV=bianchi;
		   
		   System.out.println("bianchi: "+bianchi);
		   System.out.println("trek:" +trek);
		   System.out.println("trekXV:" +trekXV);
		   
		   
//		   System.out.println("*************************");
//		   System.out.println("trek = bianchi");
//		   System.out.println("*************************");
//		   
//		   trek=bianchi;
//		   
//		   System.out.println("bianchi: "+bianchi);
//		   System.out.println("trek:" +trek);
//		   System.out.println("trekXV:" +trekXV);
//		   
//		   System.out.println("*************************");
//		   System.out.println("setting all fields for trek");
//		   System.out.println("*************************");
//		   
//		   trek.setColor("orange");
//		   trek.setGear(9);
//		   
//		   System.out.println("bianchi: "+bianchi);
//		   System.out.println("trek: " +trek);
//		   System.out.println("trekXV: " +trekXV);
//		   
//		   
//		   System.out.println("*************************");
//		   System.out.println("setting all fields for trek and bianchi");
//		   System.out.println("*************************");
//		   
//		   trek.setColor("orange");
//		   trek.setGear(9);
//		   
//		   bianchi.setGear(20);
//		   bianchi.setColor("celeste-white");
//		   
//		   
//		   trekXV.setGear(19);
//		   trekXV.setColor("celeste");
//		   
//		   
//		   System.out.println("bianchi: "+bianchi);
//		   System.out.println("trek: " +trek);
//		   System.out.println("trekXV: " +trekXV);
		   
		   
	    }
	
	
}
