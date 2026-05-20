package com.demo.model;




import java.util.Scanner;

public class Person {
    protected static int count = 1;
    protected int id;
    protected String name, mobile, email;

    public Person() {
        id = count++;
    }

    public void input(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Mobile: ");
        mobile = sc.nextLine();

        System.out.print("Enter Email: ");
        email = sc.nextLine();
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("Email: " + email);
    }
}