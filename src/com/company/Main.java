package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
	    Account account = bank.getAccount("John");
	    if (account != null) {
	        bankLoop(account);
        }

    }

    public static void bankLoop(Account account) {

        int userInput = 0;
        while (userInput != 3) {
            printMenu();
            userInput = getUserInput();
            handleUserDecision(account, userInput);
            System.out.println(account.getBalance());
        }

    }

    public static void handleUserDecision(Account account, int choice) {
        switch(choice) {
            case 1:
                account.deposit(100);
                break;
            case 2:
                account.withdraw(100);
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
        System.out.println("3. Exit");
        System.out.println("> ");
    }
}
