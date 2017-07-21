package com.easylabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Num;
        Num = in.nextInt();
        if (Num % 2 == 0) {
            System.out.println("Четное");
        } else
            System.out.println("Нечетное");


    }
}

