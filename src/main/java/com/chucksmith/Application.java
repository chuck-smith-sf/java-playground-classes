package com.chucksmith;

public class Application {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        System.out.println(account);
        account.deposit(10);
        System.out.println(account);
        account.withdraw(5);
        System.out.println(account);
        account.withdraw(5);
        long value = account.balance();
        System.out.println(value);
        System.out.println(account.isOverDrawn());
        account.withdraw(10);
        System.out.println(account.isOverDrawn());


//        Marker marker = new Marker();
//        marker.unCap();
//        System.out.println(marker);
//        marker.write("hello");
//        marker.write("world");
//        System.out.println(marker);
//
//        Marker marker2 = new Marker();
//        System.out.println(marker2);


//        Table roundTable = new Table();
//        roundTable.setShape("round");
//        System.out.println(roundTable);
    }
}
