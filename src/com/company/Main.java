package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students("Иван Иванов", 18, 0));
        students.add(new Students("Сидор Сидоров", 19, 0));
        students.add(new Students("Петр Петров", 20, 0));
        students.add(new Students("Алексей Алексеев", 21, 0));
        students.add(new Students("Тихон Тихонов", 22, 0));

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("------------------------------");
        ArrayList<Teachers> teachers = new ArrayList<>();
        teachers.add(new Teachers("Teacher1", "Algebra"));
        teachers.add(new Teachers("Teacher2", "Geometry"));
        teachers.add(new Teachers("Teacher3", "Computer science"));
        teachers.add(new Teachers("Teacher4", "English"));
        teachers.add(new Teachers("Teacher5", "Ukrainian language"));

        double maxAverageScore = 0.0;
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i));
        }
        for (int i = 0; i < students.size(); i++) {
            double sumScore = 0;

            for (int j = 0; j < teachers.size(); j++) {
                int score = random.nextInt(5) + 1;
                sumScore = sumScore + score;

            }
            if (sumScore / teachers.size() > maxAverageScore) {
                maxAverageScore = sumScore / teachers.size();
            }
            System.out.println(sumScore);
            students.get(i).setAverageScore(sumScore / teachers.size());

        }
        System.out.println("Максимальный средний балл - " + maxAverageScore);

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("------------------------------");
        for (int i = 0; i < teachers.size(); i++) {
            if (students.get(i).averageScore() == maxAverageScore) {
                System.out.println("Аббитуриент " + students.get(i).getName() + " зачислен");
            }

        }
    }
}


