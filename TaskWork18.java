package com.max.idea;

import java.util.Scanner;

public class TaskWork18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String ANSWER = "Заархивированный вирус";
        final String OK = "Правильно";
        final String NOK = "Подумай еще";
        final String SHTOSH = "Обидно, приходи в другой раз";
        final String SOVET = "Подсказка";
        String inputUser = null;
        boolean result = false;
        final int A = 3;
        System.out.println("Отгадайте загадку: \n Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");

        for (int i = 1; i <= A; i++) {
            inputUser = in.nextLine();
            switch (inputUser) {
                case ANSWER:
                    System.out.println(OK);
                    i = 3;
                    break;
                case SOVET:
                    if (i == 1) System.out.println("Почти как лук");
                    else System.out.println(SHTOSH);
                    break;
                default:
                    System.out.println(NOK);
            }
        }
    }
}

