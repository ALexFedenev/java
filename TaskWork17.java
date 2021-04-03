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
        int maxLength = 0;
        int maxStrIndex = 0;
        for (int i = 0; i < stringArr.length; i++) {
            int currentLength = (int) stringArr[i].chars().distinct().count();
            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxStrIndex = i;
            }
        }
        System.out.println(stringArr[maxStrIndex]);
        in.close();
    }
}



