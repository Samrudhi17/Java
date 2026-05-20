package com.demo.model;


import java.util.Scanner;

public class Vendor extends Employee {
    double amount;

    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Enter Amount: ");
        amount = sc.nextDouble();
        sc.nextLine();
    }

    public double calculateSalary() {
        return amount + amount * 0.18;
    }
}