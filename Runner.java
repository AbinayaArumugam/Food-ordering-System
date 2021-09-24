package com.foododering;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Account> map = new HashMap<>();
        System.out.println("Hey");
        while (true) {
        System.out.println("Welcome to Food Ordering System");
        System.out.println("1.Sign Up");
        System.out.println("2.Login");
        System.out.println("3.Exit");
        System.out.println("Enter your choice ");
        int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter your name");
                    String name = in.next();
                    System.out.println("Enter your age");
                    int age = in.nextInt();
                    System.out.println("Enter Email ID");
                    String mail = in.next();
                    System.out.println("Enter Password");
                    String newPassword = in.next();
                    if(newPassword.length()<8||newPassword.length()>12){
                        System.out.println("Your Password length is inappropriate.Your length must be 8 to 12");
                        return;
                    }
                    System.out.println("Confirm Password");
                    String confirmPassword = in.next();
                    if (!newPassword.equals(confirmPassword)) {
                        System.out.println("Your confirm password doesn't match.Try Again");
                        return;
                    }
                    System.out.println("Enter your Mobile Number ");
                    String mobileNo = in.next();
                    Account account = new Account();
                    account.setName(name);
                    account.setAge(age);
                    account.seteMail(mail);
                    account.setPassword(newPassword);
                    account.setMobileNo(mobileNo);
                    CreateAccount.createAccount(map, account, mail);
                    break;
                case 2:
                    System.out.println("Enter your Email: ");
                    String email = in.next();
                    System.out.println("Enter password");
                    String password = in.next();
                   String user= LoginInfo.loginInfo(email,password,map);
                    System.out.println("Welcome "+user +", You have successfully logged in");
                    System.out.println("We provide two ways of search.");
                    System.out.println("1.Search by Hotel");
                    System.out.println("2.Search by food");
                    System.out.println("3.Exit");
                    System.out.println("Please enter your choice");
                    int choice1=in.nextInt();
                    switch (choice1){
                        case 1:
                          Hotels.chooseHotel();
                            break;
                        case 2:
                            Hotels.chooseFood();
                            break;
                        case 3:
                           return;
                    }
                    break;
                case 3:

                    return;
            }
        }
    }
}
