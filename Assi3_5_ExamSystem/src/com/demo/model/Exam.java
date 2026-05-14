package com.demo.model;



import java.util.Scanner;

public class Exam {
    int examId;
    String name, topic, date;
    Question q[];

    public Exam(int id, String name, String topic, String date, Question q[]) {
        this.examId = id;
        this.name = name;
        this.topic = topic;
        this.date = date;
        this.q = q;
    }

    public void conductExam(Scanner sc) {
        int total = 0;

        for (int i = 0; i < q.length; i++) {
            total += q[i].askQuestion(sc);
        }

        System.out.println("\nTotal Marks: " + total);

        if (total >= 3) {
            System.out.println("Congratulations you completed the test");
        } else {
            System.out.println("Better luck next time");
        }
    }
}