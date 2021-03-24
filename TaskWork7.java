package com.max.idea;

import java.util.Scanner;

public class TaskWork7 {
    public static void main(String[] args) {
        final int X = 2;
        final int Y = 1;
        final int Z = 3;
        Scanner in = new Scanner(System.in);
        System.out.println("Установите размер массива:");
        int size = in.nextInt();
        int[] myArray = new int[size];
        System.out.println("Введите данные в массив:");
        for (int i = 0; i < size; i++) {
            myArray[i] = in.nextInt();
        }
        for (int i = 0; i < size; ++i) {
            if (myArray[i] == X || myArray[i] == Y || myArray[i] == Z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
        in.close();
    }
}

