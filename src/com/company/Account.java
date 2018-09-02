package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Account {
    String name;
    int amount;

    public Account(String name, int amount) {
        this.name = name;
        this.amount = amount;
        this.writeToFile();
    }

    public void writeToFile() {
        try {
            FileWriter writer = new FileWriter(this.name + ".txt");
            writer.write(Integer.toString(this.amount));
            writer.close();
        } catch (IOException e) {
            System.out.println("What are you doing?");
        }
    }

    public int getBalance() {
        return this.amount;
    }

    public void deposit(int amount) {
        this.amount += amount;
        this.writeToFile();
    }

    public void withdraw(int amount) {
        if (this.amount - amount < 0) {
            System.out.println("Not enough in account to withdraw");
        } else {
            this.amount -= amount;
        }
    }
}
