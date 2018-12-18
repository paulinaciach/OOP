package com.paula.info.Sekcja1;

public class VipAccount {

	private String customerName;
	private String phoneNumber;
	private double creditLimit;
	
	
	
	
	
	public VipAccount(){
	
		this("deafultName", "50000", 1000.000);
		System.out.println("Empty constructor called");
	}
	
	
	public VipAccount(String customerName, String phoneNumber) {
		
		
		this(customerName, phoneNumber, 2000.000);
		
//		this.customerName = customerName;
//		this.phoneNumber = phoneNumber;
//		this.creditLimit = 20000;
		
		System.out.println("Constructor with 2 parameters called" );
		
	}
	
	
	public VipAccount(String customerName, String phoneNumber, double creditLimit) {
		
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.creditLimit = creditLimit;
		
		System.out.println("Constructor for saving used");
		
	}
	





	public String getCustomerName() {
		return customerName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	
	
	
	
	
	
}
