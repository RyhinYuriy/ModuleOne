package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Students> persons = new ArrayList<>();
        persons.add(new Students("Иван Иванов", 18, 0));
        persons.add(new Students("Сидор Сидоров", 19, 0));
        persons.add(new Students("Петр Петров", 20, 0));
        persons.add(new Students("Алексей Алексеев", 21, 0));
        persons.add(new Students("Тихон Тихонов", 22, 0));

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }

    }
}


