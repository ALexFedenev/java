package com.max.idea;

import java.util.Locale;
import java.util.Scanner;

public class TaskWork12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str;
        boolean a;
        boolean b;
        boolean c;
        str = in.nextLine();
        a = str.contains("Java");
        b = str.startsWith("I like");
        c = str.endsWith("!!!");
        String str1;
        str1 = str.toUpperCase(Locale.ROOT);
        if (a == true && b == true && c == true) {
            System.out.println("Если все условия верны: " + str1);
        }
        String result = str.replace("a", "o");
        String res;
        res = result.substring(7, 11);
        System.out.println("Заменили символ 'a' на 'o': " + res);
        in.close();
    }
}
