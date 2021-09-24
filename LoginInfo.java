package com.foododering;

import java.util.HashMap;

public class LoginInfo {
    public static String loginInfo(String email,String password, HashMap<String,Account> map){
        String name="";
        if(map.get(email)==null){
            System.out.println("Account doesn't exist");
        }
        else {
           Account acc= map.get(email);
           String check=acc.getPassword();

           if(password.equals(check)){
              name= acc.getName();
           }else {
               System.out.println("Incorrect Password");
           }
        }
       return name;
    }
}
