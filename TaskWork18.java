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
        String userInput = null;
        System.out.println("Отгадайте загадку: \n Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        for (int i = 1; i <= 3; i++) {
            userInput = in.nextLine();
            switch (userInput) {
                case ANSWER:
                    System.out.println(OK);
                    i = 3;
                    break;
                case SOVET:
                    if (i == 1) {
                        System.out.println("Почти как лук");
                        i = 2;
                    } else System.out.println("Подсказка уже не доступна");
                    break;
                default:
                    if (i < 3) System.out.println(NOK);
                    else System.out.println(SHTOSH);
            }
        }
    }
}

