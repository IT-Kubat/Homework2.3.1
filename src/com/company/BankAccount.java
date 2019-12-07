package com.company;

public class BankAccount {

    double amount;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        amount=amount+sum;
        System.out.println("Your balance:" + amount);
        return amount;
    }

    public void withDraw(double sum) throws LimitException {
        amount=amount - sum;
        System.out.println("Your balance after operation : " + amount);
        if (sum > getAmount()) {
            throw new LimitException("Not enough money in your account: ", amount);

        }


    }


}
