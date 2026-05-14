package com.demo.model;


import java.util.Scanner;

public class Vendor extends Person {
    int vendorId;
    String phone;
    String products[];

    public void input(Scanner sc) {
        super.input(sc);

        System.out.print("Enter Vendor Id: ");
        vendorId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Phone: ");
        phone = sc.nextLine();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        products = new String[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter product " + (i+1) + ": ");
            products[i] = sc.nextLine();
        }
    }

    public void display() {
        super.display();
        System.out.println("Vendor Id: " + vendorId);
        System.out.println("Phone: " + phone);

        System.out.print("Products: ");
        for(String p : products) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}