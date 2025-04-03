package oops;

import java.util.Scanner;

public class encapsulation {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount: ");
        double amount = scanner.nextDouble();
        System.out.println("Please enter the balance amount: ");
        double balance = scanner.nextDouble();
        BankAccount bankAccount = new BankAccount(balance);
        bankAccount.setBalanceAmt(amount);
        System.out.println("Current Balance: " + bankAccount.getBalanceAmt());
    }
}

class BankAccount{

    private double balanceAmt;

    public BankAccount(double balanceAmt) {
        this.balanceAmt = balanceAmt;
    }

    public double getBalanceAmt() {
        return balanceAmt;
    }

    public void setBalanceAmt(double amount){
        if(amount >0){
            balanceAmt+=amount;
            System.out.println("Deposited amount : "+amount);
        }else {
            System.out.println("Please enter the Valid amount");
        }
    }
}
