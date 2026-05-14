package com.demo.model;



import java.util.Scanner;

public class Question {
    int qno;
    String question, opt1, opt2, opt3, opt4, ans;
    int marks;

    public void input(int qno, String q, String o1, String o2, String o3, String o4, String ans) {
        this.qno = qno;
        this.question = q;
        this.opt1 = o1;
        this.opt2 = o2;
        this.opt3 = o3;
        this.opt4 = o4;
        this.ans = ans;
        this.marks = 1;
    }

    public int askQuestion(Scanner sc) {
        System.out.println("\nQ" + qno + ": " + question);
        System.out.println("1. " + opt1);
        System.out.println("2. " + opt2);
        System.out.println("3. " + opt3);
        System.out.println("4. " + opt4);

        System.out.print("Enter answer: ");
        int choice = sc.nextInt();

        if ((choice == 1 && opt1.equals(ans)) ||
            (choice == 2 && opt2.equals(ans)) ||
            (choice == 3 && opt3.equals(ans)) ||
            (choice == 4 && opt4.equals(ans))) {
            return marks;
        }
        return 0;
    }
}
