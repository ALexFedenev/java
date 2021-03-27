package com.max.idea;

public class TaskWork14 {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 40) - 20);
            System.out.println(array[i]);
        }
        int Max = 0;
        int Min = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[Max]) {
                Max = i;
            } else if (array[i] < array[Min]) {
                Min = i;
            }
        }
        System.out.println("Максимум: " + array[Max] + "\n Минимум: " + array[Min]);
        int resultMax;
        int resultMin;
        resultMax = Math.abs(array[Max]);
        resultMin = Math.abs(array[Min]);
        int maxMax = Math.max(resultMax, resultMin);
        System.out.println(maxMax);
    }
}

