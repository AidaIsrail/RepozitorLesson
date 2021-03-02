package com.company;

import java.util.Scanner;

public class Dz1 {

    public static void main(String[] args) {
        //Даны 2 числа, написать программу, которая  выведет все четные числа  в промежутке этих чисел
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // если число четное, то можно прибавлять 2, если не четное, то прибавить 1

        if(a % 2 != 0) {
            a = a + 1;
        }
        while (a <= b) { // выводит до тех пор пока не будет цифра b
            System.out.println(a);
            a = a + 2;

        }



}}
