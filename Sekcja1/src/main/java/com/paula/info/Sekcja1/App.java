package com.paula.info.Sekcja1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//
//    	Bank bankAccount1 = new Bank();
//    	
//    	bankAccount1.setBalance(200.00);
//    	System.out.println(bankAccount1.getBalance());
//    	
//    	bankAccount1.depositFounds(240);
//    	System.out.println(bankAccount1.getBalance());
//    	
//    	bankAccount1.withdrawlFounds(110);
//    	System.out.println(bankAccount1.getBalance());
//    	bankAccount1.withdrawlFounds(20);
//    	System.out.println(bankAccount1.getBalance());
//    	bankAccount1.withdrawlFounds(20);
//    	bankAccount1.withdrawlFounds(340);
//    	
//    	
    	
    	VipAccount vipTomAccount = new VipAccount("Thomas Stringer", "324-373-584");
    	System.out.println(vipTomAccount.getCustomerName());
//    	System.out.println(vipTomAccount.getCreditLimit());
System.out.println("********************************");
//    	System.out.println(vipTomAccount.getPhoneNumber());
//    	
    	VipAccount vipMartaAccount = new VipAccount();
    	System.out.println(vipMartaAccount.getCustomerName());
    	System.out.println("********************************");
    	
    	VipAccount vipPiotrAccount = new VipAccount("Piotr", "445-545-656", 2000.33300);
    	System.out.println(vipPiotrAccount.getCustomerName());
    	System.out.println(vipPiotrAccount.getCreditLimit());
    	System.out.println("********************************");
    	
    }
}
