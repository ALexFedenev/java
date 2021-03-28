package com.max.idea;

import java.util.Scanner;

public class TaskWork16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите уравнение: ");
        String str = in.nextLine();
        char ch = str.charAt(0);
        char ch1 = str.charAt(1);
        char ch2 = str.charAt(2);
        char ch3 = '=';
        char ch4 = str.charAt(4);
        int res = 0;
        int res1 = 0;
        int res2 = 0;
        if (ch4 == 'x' & ch1 == '+') {
            res = Character.getNumericValue(ch);
            res1 = Character.getNumericValue(ch2);
            res2 = (res + res1);
        } else if (ch4 == 'x' & ch1 == '-') {
            res = Character.getNumericValue(ch);
            res1 = Character.getNumericValue(ch2);
            res2 = (res - res1);
        } else if (ch == 'x' & ch1 == '+') {
            res = Character.getNumericValue(ch4);
            res1 = Character.getNumericValue(ch2);
            res2 = (res - res1);
        } else if (ch == 'x' & ch1 == '-') {
            res = Character.getNumericValue(ch4);
            res1 = Character.getNumericValue(ch2);
            res2 = (res + res1);
        } else if (ch2 == 'x' & ch1 == '+') {
            res = Character.getNumericValue(ch4);

            res1 = Character.getNumericValue(ch);
            res2 = (res - res1);
        } else if (ch2 == 'x' & ch1 == '-') {
            res = Character.getNumericValue(ch4);
            res1 = Character.getNumericValue(ch);
            res2 = (res1 - res);
        }
        System.out.println("Вывод: " + res2);
    }
}