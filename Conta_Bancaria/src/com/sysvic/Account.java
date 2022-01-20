package com.sysvic;

import java.util.Scanner;

public class Account {
    private long numAccount;
    private String ownerName;
    private long ownerCpf;
    private double accountBalance;

    public void openAccount() {
        try {
            System.out.print("CPF:");
            Scanner scanner = new Scanner(System.in);
            this.ownerCpf = scanner.nextLong();
            scanner.reset();
            System.out.print("NAME:");
            this.generateAccountNumber();
            this.setName(scanner.next());
            this.accountBalance = 0.0;
        } catch (Exception exception) {
            System.out.printf("Exception in com.sysvic.Account:\n%s%n", exception);
        }

    }

    public long getOwnerCpf() {
        return this.ownerCpf;
    }

    public void setName(String name) {
        this.ownerName = name;
    }

    public String getName() {
        return this.ownerName;
    }

    /**
     * Generate a six number account .
     */
    public void generateAccountNumber() {

        this.numAccount = Math.round(Math.random() * 1000000);

    }

    public long getNumAccount() {
        return this.numAccount;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void withdrawAmount(double amount) {
        this.accountBalance -= amount;
        System.out.printf("New account balance:$%s%n", this.accountBalance);
    }

    public void addAmount(double amount) {
        this.accountBalance += amount;
        System.out.printf("New account balance:$%s%n", this.accountBalance);
    }

    /*
        Remove account will receive a list of Accounts
        and will remove the account from the list.
        We need to study a way to implement that
     */


}
