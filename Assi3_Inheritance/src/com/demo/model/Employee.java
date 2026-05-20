package com.demo.model;


import java.util.Scanner;

public class Employee extends Person {
    protected String dept, designation, doj;

    public void input(Scanner sc) {
        super.input(sc);

        System.out.print("Enter Department: ");
        dept = sc.nextLine();

        System.out.print("Enter Designation: ");
        designation = sc.nextLine();

        System.out.print("Enter DOJ: ");
        doj = sc.nextLine();
    }

    public void display() {
        super.display();
        System.out.println("Dept: " + dept);
        System.out.println("Designation: " + designation);
    }
}