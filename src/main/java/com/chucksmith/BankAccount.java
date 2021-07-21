package com.chucksmith;

public class BankAccount {

    @Override
    public String toString() {
        return "BankAccount{" +
                "cents=" + cents +
                '}';
    }

    public long getCents() {
        return cents;
    }

    public void setCents(long cents) {
        this.cents = cents;
    }

    private long cents = 0;

    void deposit(long cents) {
        this.cents += cents;
    }

    void withdraw(long cents) {
        this.cents -= cents;
    }

    long balance() {
        return this.cents;
    }

    boolean isOverDrawn() {
        if (this.cents < 0){
            return true;
        }
        return false;
    }
}
