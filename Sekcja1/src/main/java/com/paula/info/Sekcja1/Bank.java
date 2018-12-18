package com.paula.info.Sekcja1;

public class Bank {

	private int accountNumber;
	private double balance=0.0;
	private String customerFirstName;
	private String customeLastName;
	private String emailAddress;
	private int phoneNumber;
	
	
	public double depositFounds(double deposit) {
		
		this.balance = balance+deposit;

		return balance;
	}
	
	public void withdrawlFounds(double withdrawlMoney) {
		
		if(this.balance<withdrawlMoney) {
			System.out.println("Not enought money for this operation."
					+ " You are missig:"
		+(this.balance - withdrawlMoney));
			
		}else {
			this.balance = this.balance-withdrawlMoney;
			System.out.println("Please, take your money: "
			+withdrawlMoney+ " Your balance is: "+this.balance);
		}
		
	}
	
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomeLastName() {
		return customeLastName;
	}
	public void setCustomeLastName(String customeLastName) {
		this.customeLastName = customeLastName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
	
	
}
