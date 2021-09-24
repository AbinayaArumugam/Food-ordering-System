package com.foododering;

import java.util.HashMap;
import java.util.Scanner;

public class Hotels {
    static Scanner in =new Scanner(System.in);
    public static void chooseHotel(){
        System.out.println("Please, Choose the Hotel");
        System.out.println("1.Arya Bhavan");
        System.out.println("2.Banu Hotel");
        System.out.println("3.SR Hotel");
        System.out.println("4.Exit");
        int choice=in.nextInt();
        switch (choice){
            case 1:
                System.out.println("Welcome to Arya Bhavan");
               chooseFood();
                 break;
            case 2:
                System.out.println("Welcome to Banu Hotel");
                chooseFood();
                 break;
            case 3:
                System.out.println("Welcome to SR Hotel");
                chooseFood();
                break;
            case 4:
                return;
        }

    }
    public static void chooseFood(){
        HashMap<Integer ,Integer> map=new HashMap<>();
        map.put(1,70);
        map.put(2,100);
        map.put(3,95);
        map.put(4,15);
        map.put(5,75);
        map.put(6,80);
        map.put(7,90);
        map.put(8,120);
        map.put(9,35);
        int amount=0;
        System.out.println("Please choose the food");
        System.out.println("1.Sandwich          70");
        System.out.println("2.Pizza             100");
        System.out.println("3.Fried Rice        95");
        System.out.println("4.Parotta           15");
        System.out.println("5.Noodles           75");
        System.out.println("6.Chicken Rice      80");
        System.out.println("7.Chicken Briyani   90");
        System.out.println("8.Prawn             120");
        System.out.println("9.Faloda            35");
        System.out.println("10.Cart");
        System.out.println("11.Exit");
        while (true) {
            System.out.println("Enter your Choice");
            int food = in.nextInt();
            if(food<=9&&food>=1) {
                amount += map.get(food);
            }
           else  if(food==11){
                return;
            }
            else if (food==10){
                System.out.println("--------Cart--------");
                System.out.println("Your Total Order Amount is "+ amount);
                System.out.println("Do you wish to Order (Y=1/N=0):");
                int ans=in.nextInt();
                if(ans==1){
                    System.out.println("Your Order id placed.");
                    return;
                }
                System.out.println("Do you wish to Add or Cancel");
                System.out.println("1.Add item");
                System.out.println("2.Cancel item");
                System.out.println("3.Cancel item");
                int wish=in.nextInt();
                if(wish==2){
                    System.out.println("Which item you want to cancel");
                    food=in.nextInt();
                    amount-=map.get(food);
                }
                else if(wish==3){
                    System.out.println("Your order is cancelled");
                    return;
                }
            }
        }
    }
}
