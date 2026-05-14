package com.demo.test;

import com.demo.service.TeamService;
import java.util.Scanner;

public class TestTeam {

    public static void main(String[] args) {

        TeamService ts = new TeamService();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1. Add Team");
            System.out.println("2. Delete Team");
            System.out.println("3. Delete Player");
            System.out.println("4. Display Batsman");
            System.out.println("5. Display By Speciality");
            System.out.println("6. Add Player");
            System.out.println("7. Modify Coach");
            System.out.println("8. Display All Teams");
            System.out.println("9. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: ts.addTeam(); break;
                case 2: ts.deleteTeam(); break;
                case 3: ts.deletePlayer(); break;
                case 4: ts.displayBatsman(); break;
                case 5: ts.displayBySpeciality(); break;
                case 6: ts.addPlayerToTeam(); break;
                case 7: ts.modifyCoach(); break;
                case 8: ts.displayAll(); break;
                case 9: System.out.println("Exit"); break;
                default: System.out.println("Invalid choice");
            }

        } while (choice != 9);
    }
}