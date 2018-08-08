package models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


public class Account {


	private String firstName;
	private String lastName;
	private String accountNumber;
	
	public Account(String firstName, String lastName, String accountNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
	}
	

	
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getAccountNumber() {
		return this.accountNumber;
	}

	@Override
	public String toString() {
		return "Account [firstName=" + firstName + ", lastName=" + lastName + ", accountNumber=" + accountNumber + "]";
	}
	



}
