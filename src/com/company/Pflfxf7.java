package com.company;

import java.util.Scanner;

public class Pflfxf7 {
    public static void main(String[] args) {
        //Напишите программу которая получает два целых числа и
        //находит их произведение, не используя операцию
        //умножения. Учтите, что числа могут быть отрицательными.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = a;
        int i = 1;
        if (b > 0) {
            while (i < b) {
                n = n + a;
                i++;
            }
        } else {
            while (i > b) {
                n = n - a;
                i--;
            }
        }
        System.out.println(n);
    }}
