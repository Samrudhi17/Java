package com.demo.model;



import java.util.Scanner;

public class IndividualCustomer extends Customer {
    String phone;

    public void input(Scanner sc) {
        super.input(sc);

        System.out.print("Enter Phone: ");
        phone = sc.nextLine();
    }

    public void display() {
        super.display();
        System.out.println("Phone: " + phone);
    }
}
