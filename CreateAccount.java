package com.foododering;

import java.util.HashMap;
import java.util.Map;


public class CreateAccount {
    public static Map createAccount(HashMap<String,Account >map, Account account, String eMail){
        if(map.get(eMail)==null){
            map.put(eMail,account);
        } else {
            System.out.println("Your account already exists.Please, Login!");
        }
        return map;
        // System.out.println(map);
    }
}
