package com.chucksmith;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

interface Animal {

}

public class Application {

    public static void main(String[] args) {

// Java Object Model
        Person person = new Person();
        //
        System.out.println(person.toString());
        System.out.println(person instanceof Person);
        System.out.println(person instanceof Object);

        Object obj = new Object();
        System.out.println(obj instanceof Person);
        System.out.println(person instanceof Animal);
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list instanceof List);


// Constructors
//        Order newOrder = new Order("1", "stuff");
//        Order newOrder2 = new Order(args[0], args[1]);
//        System.out.println(newOrder.getCreatedDate());
//        System.out.println(newOrder.getName());
//        System.out.println(newOrder2.getName() + " " + newOrder2.getOrderNumber());

// State and Behavior
//        BankAccount account = new BankAccount();
//        System.out.println(account);
//        account.deposit(10);
//        System.out.println(account);
//        account.withdraw(5);
//        System.out.println(account);
//        account.withdraw(5);
//        long value = account.balance();
//        System.out.println(value);
//        System.out.println(account.isOverDrawn());
//        account.withdraw(10);
//        System.out.println(account.isOverDrawn());

//        BankAccount account = new BankAccount();
//        System.out.println(account);
//        account.deposit(10);
//        System.out.println(account);
//        account.withdraw(5);
//        System.out.println(account);
//        account.withdraw(5);
//        long value = account.balance();
//        System.out.println(value);
//        System.out.println(account.isOverDrawn());
//        account.withdraw(10);
//        System.out.println(account.isOverDrawn());


//        Marker marker = new Marker(false, .7f);
//        marker.unCap();
//        System.out.println(marker);
//        marker.write("hello");
//        marker.write("world");
//        System.out.println(marker);

//        Marker marker2 = new Marker(true, .5f);
//        System.out.println(marker2);


//        Table roundTable = new Table();
//        roundTable.setShape("round");
//        System.out.println(roundTable);
    }
}
