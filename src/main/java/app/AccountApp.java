package app;

import models.Account;
import admin.Service;
import utilities.JSONHandle;

public class AccountApp {
	
	
	Service service;
	
	public AccountApp() {
		service = new Service();
		service.addAccount(new Account("Zakariya","Mohamed","787878"));
		service.addAccount(new Account("Cristiano","Ronaldo","653572"));
	}

	public void printDetailsByKey(int key) {
		
		Account account = service.getAccountByKey(key);
		
		System.out.println("First Name: " + account.getFirstName());
		System.out.println("First Name: " + account.getLastName());
		System.out.println("First Name: " + account.getAccountNumber());
		
		
		
	}
	
	public void run() {
		
	//	this.printDetailsByKey("123");

		String convertToJsonString = JSONHandle.convertToJsonString(service.getAccountByKey(0));

		//System.out.printf(convertToJsonString);

		System.out.println(service.getJsonString());
	
	}
	
	

	public static void main(String args[]) {
		
		
		new AccountApp().run();
		
	}
	
}
