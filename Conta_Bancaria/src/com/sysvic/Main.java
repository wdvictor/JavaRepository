package com.sysvic;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    final byte OPEN_ACCOUNT_OPTION = 1;
    final byte CLOSE_ACCOUNT_OPTION = 2;
    final byte LIST_ACCOUNTS_OPTION = 3;
    final byte WITHDRAW_AMOUNT_OPTION = 4;
    final byte ADD_AMOUNT_OPTION = 5;
    final byte ACCOUNT_STATUS_OPTION = 6;
    final byte QUIT_OPTION = 9;

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<Account>();

        byte menuOption = 0;
        System.out.println("\n\t\t\t\t\t\t\t\t\tWelcome to not invited bank");
        System.out.println("\t\t\t\t\t\t\t\t\tWe don't appreciate you here");
        do {
            System.out.println("\t\t\t\t---------------------------------------------------------------");
            System.out.println("\t\t\t\t|                              Menu                           |");
            System.out.println("\t\t\t\t| Open Account (1)    | Close Account (2) | List Accounts (3) |");
            System.out.println("\t\t\t\t| Withdraw Amount (4) | Add amount (5)    | Account status (6)|");
            System.out.println("\t\t\t\t|                       Quit (9) Do that                      |");
            System.out.println("\t\t\t\t---------------------------------------------------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Select option:");
            menuOption = scanner.nextByte();
            switch (menuOption) {
                case 1:
                    Account newAccount = new Account();
                    newAccount.openAccount();
                    accounts.add(newAccount);
                    break;
                case 2:
                    break;
                case 3:
                    for (Account account : accounts) {
                        System.out.printf("- %s\n", account.getNumAccount());
                    }
                    break;
                case 9:
                    System.out.println("Bye motherfucker, don't come back!!");
                    System.out.println("           _|_     _|_             ");
                    break;
                default:
                    System.out.println("Invalid option, stupid!");

            }
        } while (menuOption != 9);

    }
}
