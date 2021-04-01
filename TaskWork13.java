package com.max.idea;

import java.util.Scanner;

public class TaskWork13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = in.nextLine();
        str = str.trim();
        str = str.replaceAll("[^A-Za-z0-9 ]", "");
        System.out.println(str);
        String[] res = str.split(" ");
        int count = 0;
        for (int i = 0; i < res.length; i++) {
            if (res[i].length() >= 1)
                count++;
        }
        System.out.println(count);
    }
}
