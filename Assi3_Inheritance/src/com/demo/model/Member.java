package com.demo.model;



import java.util.Scanner;

public class Member extends Person {
    String type;
    double amount;

    public void input(Scanner sc) {
        super.input(sc);

        System.out.print("Enter Membership Type: ");
        type = sc.nextLine();

        System.out.print("Enter Amount Paid: ");
        amount = sc.nextDouble();
        sc.nextLine();
    }

    public void display() {
        super.display();
        System.out.println("Membership: " + type);
        System.out.println("Amount: " + amount);
    }
}