package com.demo.model;



import java.util.Scanner;

public class SalariedEmp extends Employee {
    double basic;

    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Enter Basic: ");
        basic = sc.nextDouble();
        sc.nextLine();
    }

    public double calculateSalary() {
        double da = 0.10 * basic;
        double hra = 0.15 * basic;
        double pf = 0.12 * basic;
        return basic + da + hra - pf;
    }
}