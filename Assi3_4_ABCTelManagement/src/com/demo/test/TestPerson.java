package com.demo.test;



import java.util.*;
import com.demo.model.*;

public class TestPerson {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Individual Customer");
        System.out.println("2. Company Customer");
        System.out.println("3. Vendor");

        int choice = sc.nextInt();
        sc.nextLine();

        switch(choice) {
            case 1:
                IndividualCustomer ic = new IndividualCustomer();
                ic.input(sc);
                ic.display();
                break;

            case 2:
                CompanyCustomer cc = new CompanyCustomer();
                cc.input(sc);
                cc.display();
                break;

            case 3:
                Vendor v = new Vendor();
                v.input(sc);
                v.display();
                break;
        }
    }
}