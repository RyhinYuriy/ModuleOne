package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task2GuessNumber {

    public static void main(String[] args) {
        int number;
        int k = 5;
        Random random = new Random();
        number = random.nextInt(50);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадайте число. Введите свой вариант");
        for (int i = 0; i < k; i++) {
            int newNumber = scanner.nextInt();
            if (newNumber == number) {
                System.out.println("Вы угадали");
            } else {
                if (newNumber < number) {
                    System.out.println("Ваше число меньше загаданного");
                } else {
                    System.out.println("Ваше число больше загаданного");
                }
                System.out.println("Следующая попытка");

            }

        }
        System.out.println("Попытки закончились");
    }
}
