package com.demo.model;



import java.util.Scanner;

public class CompanyCustomer extends Customer {
    String manager;
    double creditLine;
    int extensions;
    String numbers[];

    public void input(Scanner sc) {
        super.input(sc);

        System.out.print("Enter Relationship Manager: ");
        manager = sc.nextLine();

        System.out.print("Enter Credit Line: ");
        creditLine = sc.nextDouble();

        System.out.print("Enter Extensions: ");
        extensions = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter number of phone numbers: ");
        int n = sc.nextInt();
        sc.nextLine();

        numbers = new String[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = sc.nextLine();
        }
    }

    public void display() {
        super.display();
        System.out.println("Manager: " + manager);
        System.out.println("Credit Line: " + creditLine);
        System.out.println("Extensions: " + extensions);

        System.out.print("Numbers: ");
        for(String num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}