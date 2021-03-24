package com.max.idea;

import java.util.Scanner;

public class TaskWork8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        int size = in.nextInt();
        int[] myArray = new int[size];
        for (int i = 0; i < size; i++) {
            myArray[i] = i + 1;
        }
        int sum = 0;
        for (int a = 0; a < size; a++) {
            if (myArray[a] % 2 - 1 == 0) {
                sum += myArray[a];
            }
        }
        System.out.println("Сумма отрицательных чисел: " + sum);
        in.close();
    }
}

