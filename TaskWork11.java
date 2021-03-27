package com.max.idea;

import java.util.Scanner;

public class TaskWork11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = in.nextInt();
        String str;
        str = Integer.toString(a);
        System.out.println("Введите второе число: ");
        int b = in.nextInt();
        Integer x = Integer.parseInt(str);
        int result = Math.max(b, x);
        System.out.println("Большеe число: " + result);
        double x1 = x.doubleValue();
        System.out.println("Меньшее: " + x1);
        in.close();
    }
}
