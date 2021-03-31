package com.max.idea;

import java.util.Scanner;

public class TaskWork17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int lengthArr = in.nextInt();
        String stringArr[] = new String[lengthArr];
        for (int i = 0; i < stringArr.length; i++) {
            System.out.println("Введите строку " + (i + 1));
            stringArr[i] = in.next();
        }
        int cont = 0;
        char ch = 0;
        char ch1 = 0;
        for (int i = 0; i < lengthArr; i++) {
            for (int x = 0; x < stringArr[i].length(); x++) {
                for (int c = x + 1; c < stringArr[i].length(); c++) {
                    if (stringArr[i].charAt(x) == stringArr[i].charAt(c)) {
                        ch =stringArr[i].charAt(c);
                        System.out.println(ch);
                    }
                }
            }
            System.out.println(ch);
        }
    }
}


