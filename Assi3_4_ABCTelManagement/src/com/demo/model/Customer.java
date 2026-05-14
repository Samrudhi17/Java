package com.demo.model;



import java.util.Scanner;

public class Customer extends Person {
    int custId;
    String creditClass;
    double discount;
    String plan;

    public void input(Scanner sc) {
        super.input(sc);

        System.out.print("Enter Customer Id: ");
        custId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Credit Class: ");
        creditClass = sc.nextLine();

        System.out.print("Enter Discount: ");
        discount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Plan: ");
        plan = sc.nextLine();
    }

    public void display() {
        super.display();
        System.out.println("Customer Id: " + custId);
        System.out.println("Credit Class: " + creditClass);
        System.out.println("Discount: " + discount);
        System.out.println("Plan: " + plan);
    }
}
