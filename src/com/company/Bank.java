package com.company;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bank {
    public Account getAccount(String name) {
        Account account = null;
        try {
            FileReader reader = new FileReader(name + ".txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String currentAcountBalance;

            currentAcountBalance = bufferedReader.readLine();

            account = new Account(name, Integer.parseInt(currentAcountBalance));

        } catch (IOException e) {
            System.out.println("No Account found!");
        }
        return account;
    }
}
