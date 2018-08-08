package Test;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import models.Account;
import admin.Service;

public class ServiceTest {

	Service service;
	
	@Before
	public void setup() {
		service = new Service();

	}

	@Test
	public void testRetrieveAccount() {
		assertEquals(0, this.service.getTotalAccounts());
		service.addAccount(new Account("zakariya","mohamed","787878"));
		assertEquals(1, this.service.getTotalAccounts());
		assertEquals("zakariya", this.service.getAccountByKey(0).getFirstName());
		service.addAccount(new Account("bob","smith","5756"));
		assertEquals(2, this.service.getTotalAccounts());
		service.removeAccountByKey(0);
		assertEquals(1, this.service.getTotalAccounts());
		service.addAccount(new Account("bob","smith","654"));
		service.addAccount(new Account("fred","brown","6543"));
		service.addAccount(new Account("leo","parker","5786556"));
		assertEquals(4, this.service.getTotalAccounts());


		String jsonString = "{\"1\":{\"firstName\":\"bob\",\"lastName\":\"smith\",\"accountNumber\":\"5756\"},\"2\":{\"firstName\":\"bob\",\"lastName\":\"smith\",\"accountNumber\":\"654\"},\"3\":{\"firstName\":\"fred\",\"lastName\":\"brown\",\"accountNumber\":\"6543\"},\"4\":{\"firstName\":\"leo\",\"lastName\":\"parker\",\"accountNumber\":\"5786556\"}}";


		assertEquals(jsonString, this.service.getJsonString());





	}
	

	
	
	
}