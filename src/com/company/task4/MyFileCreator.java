package com.company.task4;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class MyFileCreator {
    public static void write(String fileName, String text) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static Random random = new Random();
    static String login = "login";
    static int num = random.nextInt(1000);
    static String fileName = "D:\\Java A level\\Project\\ModuleFirst\\src\\com\\company\\task4\\paswords.txt";
    static String text = login+num + "\t" + (20+random.nextInt(20));


    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        MyFileCreator.write(fileName, text);
        int i = 0;
        while (i < 1000) {
            String newText = login + random.nextInt(1000) + "\t" + (20+random.nextInt(100));
            MyFileCreator.update(fileName, newText);
            i++;
        }
        String textFromFile = MyFileCreator.read(fileName);
    //    System.out.println(textFromFile);
    }

    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }


    public static void update(String nameFile, String newText) throws FileNotFoundException {
        exists(fileName);
        StringBuilder sb = new StringBuilder();
        String oldFile = read(nameFile);
        sb.append(oldFile);
        sb.append(newText);
        write(nameFile, sb.toString());
    }

    public static String read(String fileName) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        exists(fileName);
        try {
            File file = new File(fileName);
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}