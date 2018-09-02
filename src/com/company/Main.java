package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        String name = bank.getAccountName();
	    Account account = bank.getAccount(name);
	    if (account != null) {
	        bank.bankLoop(account);
        }

    }
}
