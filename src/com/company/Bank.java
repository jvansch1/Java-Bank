package com.company;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Bank {

    Account account;

    public Account getAccount(String name) {
        Account account = null;
        try {
            FileReader reader = new FileReader(name + ".txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String currentAcountBalance;

            currentAcountBalance = bufferedReader.readLine();

            account = new Account(name, Integer.parseInt(currentAcountBalance));

        } catch (IOException e) {
            System.out.println("New Account Created!");
        }
        return account;
    }

    public void bankLoop(Account account) {
        int userInput = 0;
        while (userInput != 4) {
            printMenu();
            userInput = getUserInput();
            handleUserDecision(account, userInput);
        }
    }

    public String getAccountName() {
        System.out.println("Please enter account name");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }

    public void handleUserDecision(Account account, int choice) {
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

    public int getUserInput() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return Integer.parseInt(s);
    }

    public void printMenu() {
        System.out.println("Please select an option: ");
        System.out.println();
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Balance");
        System.out.println("4. Exit");
        System.out.println("> ");
    }
}
