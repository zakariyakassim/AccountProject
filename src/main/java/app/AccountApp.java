package app;

import models.Account;
import admin.Service;
import models.AccountMap;
import utilities.JSONHandle;

public class AccountApp {
	
	
	private Service service;
	
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

        System.out.println(service.toXML());


        AccountMap employeeMap = new AccountMap();
        employeeMap.setAccountMap(service.getBankAccounts());

     /*


        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(AccountMap.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(employeeMap, System.out);
            jaxbMarshaller.marshal(employeeMap, new File("c:/temp/employees.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        } */



    }
	
	

	public static void main(String args[]) {
		
		
		new AccountApp().run();
		
	}
	
}
