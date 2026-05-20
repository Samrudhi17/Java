package com.demo.test;



import java.util.*;
import com.demo.model.*;

public class TestPerson {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee emp[] = new Employee[10];
        int count = 0;

        int choice;
        do {
            System.out.println("\n1.Add Employee");
            System.out.println("2.Display All");
            System.out.println("3.Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("1.Salaried 2.Contract 3.Vendor");
                    int t = sc.nextInt();
                    sc.nextLine();

                    if(t == 1)
                        emp[count] = new SalariedEmp();
                    else if(t == 2)
                        emp[count] = new ContractEmp();
                    else
                        emp[count] = new Vendor();

                    emp[count].input(sc);
                    count++;
                    break;

                case 2:
                    for(int i = 0; i < count; i++)
                        emp[i].display();
                    break;

                case 3:
                    System.out.println("Exit...");
            }

        } while(choice != 3);
    }
}
