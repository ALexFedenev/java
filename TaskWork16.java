package com.max.idea;

import java.util.Scanner;

public class TaskWork16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = null;
        int strLenght = 0;
        do {
            System.out.println("Введите уравнение длинной 5 символов: ");
            str = in.nextLine();
            strLenght = str.length();
        } while (strLenght > 5);
        char ch = str.charAt(0);
        char ch1 = str.charAt(1);
        char ch2 = str.charAt(2);
        char ch3 = '=';
        char ch4 = str.charAt(4);
        int result = 0;
        int result1 = 0;
        int resultX = 0;
        if (ch4 == 'x' & ch1 == '+') {
            result = Character.getNumericValue(ch);
            result1 = Character.getNumericValue(ch2);
            resultX = (result + result1);
        } else if (ch4 == 'x' & ch1 == '-') {
            result = Character.getNumericValue(ch);
            result1 = Character.getNumericValue(ch2);
            resultX = (result - result1);
        } else if (ch == 'x' & ch1 == '+') {
            result = Character.getNumericValue(ch4);
            result1 = Character.getNumericValue(ch2);
            resultX = (result - result1);
        } else if (ch == 'x' & ch1 == '-') {
            result = Character.getNumericValue(ch4);
            result1 = Character.getNumericValue(ch2);
            resultX = (result + result1);
        } else if (ch2 == 'x' & ch1 == '+') {
            result = Character.getNumericValue(ch4);
            result1 = Character.getNumericValue(ch);
            resultX = (result - result1);
        } else if (ch2 == 'x' & ch1 == '-') {
            result = Character.getNumericValue(ch4);
            result1 = Character.getNumericValue(ch);
            resultX = (result1 - result);
        }
        System.out.println("x=" + resultX);
        in.close();
    }
}