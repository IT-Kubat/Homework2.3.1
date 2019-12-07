package com.company;

public class Main {

    public static void main(String[] args) {
	BankAccount bankAccount = new BankAccount();
	bankAccount.deposit(10000);
        while (true){
            try{
                bankAccount.withDraw(6000);
                System.out.println(bankAccount.getAmount());
            } catch (Exception re){
                System.out.println(re.getMessage());
                re.printStackTrace();
                System.out.println("You are able to take: " + " " + bankAccount.getAmount());
                bankAccount.amount=bankAccount.amount-bankAccount.getAmount();
                System.out.println("You took all your money: " + " " + bankAccount.getAmount());
                break;

            }


    }



    }

}
