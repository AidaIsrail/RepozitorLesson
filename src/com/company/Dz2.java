package com.company;

import java.util.Scanner;

public class Dz2 {
    public static void main(String[] args) {

        //Даны два целых числа, нужно написать программу, которая выведет все
        //четные числа в промежутке этих чисел включительно.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a % 2 != 1) {
            a = a + 1;
        }
        while (a <= b) { // выводит до тех пор пока не будет цифра b
            System.out.println(a);
            a = a + 2;

        }



    }}
