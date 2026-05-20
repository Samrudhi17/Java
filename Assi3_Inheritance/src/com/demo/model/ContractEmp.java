package com.demo.model;



import java.util.Scanner;

public class ContractEmp extends Employee {
    int hrs;
    double rate;

    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Enter Hours: ");
        hrs = sc.nextInt();

        System.out.print("Enter Rate: ");
        rate = sc.nextDouble();
        sc.nextLine();
    }

    public double calculateSalary() {
        return hrs * rate;
    }
}