package com.max.idea;

import java.util.Scanner;

public class TaskWork13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = in.nextLine();
        String asd = str.replaceAll("[^a-zA-Za ]", "");
        System.out.println(asd);
        String[] res = asd.split(" +");
        int b = res.length;
        System.out.println(b);
    }
}