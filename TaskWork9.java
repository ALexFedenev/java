package com.max.idea;

import java.util.Scanner;

public class TaskWork9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Установите размер массива:");
        int size = in.nextInt();
        double[] myArray = new double[size];
        System.out.println("Введите данные в массив:");
        for (int i = 0; i < size; i++) {
            myArray[i] = in.nextDouble();
        }
        double sum = 0;
        for (double x : myArray) {
            sum += x;
        }
        double average = sum / size;
        for (int i = 0; i < size; i++) {
            myArray[i] *= average;
            System.out.println("Элемент массива * среднее значение: " + myArray[i]);
        }
        in.close();
    }
}
