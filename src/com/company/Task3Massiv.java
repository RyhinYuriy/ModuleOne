package com.company;

import java.util.Random;

public class Task3Massiv {
    public static void main(String[] args) {
        Random random = new Random();
        int k = Math.abs(random.nextInt(11) + 1);
        int razmerMas = Math.abs(random.nextInt(11) + 1);
        int rezult = razmerMas;
        int[] mas = new int[razmerMas];
        for (int j = 0; j < mas.length; j++) {
            mas[j] = Math.abs(random.nextInt(11));
        }
        System.out.println("Массив состоит из " + razmerMas + " элементов");
        for (int x = 0; x < mas.length; x++) {
            System.out.print(mas[x] + "\t");
        }
        System.out.println(" ");
        int result = 0;
        int countUnique = 0;
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            countUnique++;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[j] == mas[i]) {
                    count++;
                }
            }
        }
        result = countUnique - count;
        System.out.println("Число неповторяющихся элементов - " + result);
    }
}


