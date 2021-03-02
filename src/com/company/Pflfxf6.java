package com.company;

import java.security.PublicKey;
import java.util.Scanner;

public class Pflfxf6 {

    public static void main(String[] args) {
 //Напишите программу которая получает два целых
        //числа A и B (0 < A < B) и выводит квадраты всех
        //натуральных чисел в интервале от A и B.


        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt(); // конечная точка
        int n = sc.nextInt(); //cчетчик  --> стартовая точка
        while (c <= n) {
            System.out.println(c * c);
            c++;
        }
        System.out.println(c);
    }}

