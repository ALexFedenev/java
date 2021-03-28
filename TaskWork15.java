package com.max.idea;

import java.util.Scanner;

public class TaskWork15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара: ");
        double curs = in.nextDouble();
        System.out.println("Количество рублей: ");
        double rub = in.nextDouble();
        double itog = rub / curs;
        System.out.printf("Итого : %.2f долларов", itog);
        in.close();
    }
}
