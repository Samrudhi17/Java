package com.demo.test;



import java.util.*;
import com.demo.model.*;

public class TestExam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        Question jq[] = new Question[5];
        for(int i = 0; i < 5; i++) jq[i] = new Question();

        jq[0].input(1,"Java is?","Language","OS","DB","Browser","Language");
        jq[1].input(2,"Extension of Java file?",".java",".txt",".html",".js",".java");
        jq[2].input(3,"JVM stands for?","Java VM","Virtual Machine","Java Virtual Machine","None","Java Virtual Machine");
        jq[3].input(4,"Keyword for class?","class","int","void","new","class");
        jq[4].input(5,"Java is?","Compiled","Interpreted","Both","None","Both");

        
        Question hq[] = new Question[5];
        for(int i = 0; i < 5; i++) hq[i] = new Question();

        hq[0].input(1,"HTML stands for?","Hyper Text Markup Language","High Text","Hyper Tool","None","Hyper Text Markup Language");
        hq[1].input(2,"HTML tag for paragraph?","<p>","<h1>","<div>","<br>","<p>");
        hq[2].input(3,"HTML file extension?",".html",".java",".txt",".css",".html");
        hq[3].input(4,"Line break tag?","<br>","<p>","<hr>","<h1>","<br>");
        hq[4].input(5,"HTML is?","Language","Programming","DB","OS","Language");

        Exam javaExam = new Exam(1,"Java Test","Java","10-04-2026",jq);
        Exam htmlExam = new Exam(2,"HTML Test","HTML","10-04-2026",hq);

        char ch;
        do {
            System.out.println("\n1. Java Exam");
            System.out.println("2. HTML Exam");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if(choice == 1)
                javaExam.conductExam(sc);
            else if(choice == 2)
                htmlExam.conductExam(sc);

            System.out.print("\nDo you want to continue (y/n): ");
            ch = sc.next().charAt(0);

        } while(ch == 'y' || ch == 'Y');
    }
}
