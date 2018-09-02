package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        String name = getAccountName();
	    Account account = bank.getAccount(name);
	    if (account != null) {
	        bankLoop(account);
        }

    }

    public static void bankLoop(Account account) {
        int userInput = 0;
        while (userInput != 4) {
            printMenu();
            userInput = getUserInput();
            handleUserDecision(account, userInput);
        }
    }

    public static String getAccountName() {
        System.out.println("Please enter account name");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }

    public static void handleUserDecision(Account account, int choice) {
        switch(choice) {
            case 1:
                account.handleDeposit();
                break;
            case 2:
                account.handleWithdraw();
                break;
            case 3:
                System.out.println(account.getBalance());
                break;
        }
    }

    public static int getUserInput() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return Integer.parseInt(s);
    }

    public static void printMenu() {
        System.out.println("Please select an option: ");
        System.out.println();
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Balance");
        System.out.println("4. Exit");
        System.out.println("> ");
    }
}
