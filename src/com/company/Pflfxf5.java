package com.company;

import java.util.Scanner;

public class Pflfxf5 {
    public static void main(String[] args) {
        // Задача. Определить количество цифр в десятичной записи целого
        //положительного числа, записанного в переменную n
        //считает количество цифр в строке


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0; // счетчик
        while (c <=0) { //(int) 123 / 10 = 12.3 --> 12 (целое число)
            n = n / 10;
            c++;

        }
        System.out.println(c);
    }
}

