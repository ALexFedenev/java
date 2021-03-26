package com.max.idea;

import java.util.Scanner;

public class TaskWork10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте размеры матрицы");
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] myArray = new int[a][b];
        System.out.println("Заполните матрицу формата " + a + "*" + b);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                myArray[i][j] = in.nextInt();
            }
        }
        System.out.println("Первая строка матрицы, каждое значение умножаем на 3: ");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < b; j++) {
                myArray[0][j] *= 3;
                System.out.print(myArray[0][j]);
                System.out.print(" ");
            }
        }
        in.close();
    }
}











