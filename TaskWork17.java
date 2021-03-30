package com.max.idea;

import java.util.Scanner;

public class TaskWork17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int lengthArr = in.nextInt();
        String stringArr[] = new String[lengthArr];
        System.out.println("Введите строки: ");
        for (int i = 0; i < stringArr.length; i++) {
            stringArr[i] = in.next();
        }
        for (int i = 0; i < lengthArr; i++) {
            System.out.println(stringArr[i].length());
        }
    }
}
