package com.company;

import java.util.Scanner;

public class DZ21 {

    public static void main(String[] args) {

        //Даны два целых числа, нужно написать программу, которая выведет все
        //нечетные числа в промежутке этих чисел включительно наоборот (10 3).

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){ // если отрицательное число, то надо добавить код в этой же скобке (&& a% 2 !--1)
           int temp = a; //temp - временное хранение
            a = b;
            b = temp;
        }
        if(a % 2 != 1) {
            a++;
        }
        while (a <= b) { // выводит до тех пор пока не будет цифра b
            System.out.println(a);
            a = a + 2;

        }



    }}


