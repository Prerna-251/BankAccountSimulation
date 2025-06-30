/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountsimulation;

/**
 *
 * @author Prerna
 */
import java.util.ArrayList;

public class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;
    ArrayList<Transaction> transactionHistory;

    // Constructor to initialize account
    public BankAccount(String name, String number) {
        this.accountHolderName = name;
        this.accountNumber = number;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            transactionHistory.add(new Transaction("Deposit", amount));
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance = balance - amount;
                transactionHistory.add(new Transaction("Withdrawal", amount));
                System.out.println("Withdrew: " + amount);
            } else {
                System.out.println("Insufficient Balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void printTransactionHistory() {
        System.out.println("\n--- Transaction History ---");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (Transaction t : transactionHistory) {
                System.out.println(t);
            }
        }
    }
}

