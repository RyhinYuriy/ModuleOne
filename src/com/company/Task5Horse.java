package com.company;

public class Task5Horse {
    public static void main(String[] args) {
        int currentPositionX = 2;
        int currentPositionY = 7;

        int newPositionX = 3;
        int newPositionY = 5;

        if (newPositionX < 1 || newPositionX > 8 || newPositionY < 1 || newPositionY > 8)

        {
            System.out.println("not fine");
            return;
        }

        if ((Math.abs(currentPositionX - newPositionX) == 2 && Math.abs(currentPositionY - newPositionY) == 1)
                || (Math.abs(currentPositionY - newPositionY) == 2 && Math.abs(currentPositionX - newPositionX) == 1))

        {
            System.out.println("fine");
        } else

        {
            System.out.println("not fine");
        }
    }}
