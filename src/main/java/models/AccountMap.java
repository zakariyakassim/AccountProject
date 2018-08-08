package models;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "accounts")
@XmlAccessorType(XmlAccessType.FIELD)
public class AccountMap {

    private Map<Integer, Account> accountMap = new HashMap<Integer, Account>();

    public Map<Integer, Account> getAccountMap() {
        return accountMap;
    }

    public void setAccountMap(Map<Integer, Account> employeeMap) {
        this.accountMap = employeeMap;
    }
}


