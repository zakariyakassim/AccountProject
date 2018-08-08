package utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import models.Account;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;


public class JSONHandle {

    private static Gson gson = new GsonBuilder().create();

    public JSONHandle(){
       // gson = new GsonBuilder().create();
    }

    public static String convertToJsonString(Account account){

        String convertedString = gson.toJson(account);

        return convertedString;
    }

    public static Account jsonStringToAccount(String jsonToConvert){

        Account account = gson.fromJson(jsonToConvert, Account.class);

        return account;

    }

    public static String hashMapToJson(Map<Integer, Account> map){

        String convertedJson = gson.toJson(map);

        return convertedJson;

    }

    public static HashMap<Integer, Account> jsonToMap(String jsonToConvert){

        Type type = new TypeToken<Map<String, String>>(){}.getType();

        Map<Integer, Account> convertedMap = gson.toJson(jsonToConvert,type);

    }




}
