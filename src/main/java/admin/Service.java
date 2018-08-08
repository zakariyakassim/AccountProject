package admin;
import models.Account;
import utilities.JSONHandle;

import java.util.HashMap;
import java.util.Map;

public class Service {

	
    private Map<Integer, Account> bankAccounts;
    private int count = 0;


	public Service() {
		bankAccounts = new HashMap<Integer, Account>();
	}
	
	public void addAccount(Account account) {
		bankAccounts.put(count, account);
		count++;
		
	}
	
	public Account getAccountByKey(int key) {
		
		return this.bankAccounts.get(key);
		
	}
	
	public boolean removeAccountByKey(int key) {

	    Boolean keyExists = bankAccounts.containsKey(key);

		if (keyExists) {
			
			this.bankAccounts.remove(key);
			
			return true;
			
		} else {
			return false;
		}

	}

	public String getJsonString(){
	    return JSONHandle.hashMapToJson(this.bankAccounts);
    }

    public int getTotalAccounts(){
	    return this.bankAccounts.size();
    }
}
