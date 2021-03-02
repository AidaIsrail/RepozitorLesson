package com.company;

import java.util.Scanner;

public class DZ4 {

    public static void main(String[] args) {
    //Найдите все пятизначные числа, которые при делении на 133 дают в
    //остатке 125, а при делении на 134 дают в остатке 111.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a<=b) {
            if(a % 133 == 125 && a % 134 == 111){
                System.out.println(a);
            }
            a++;}



}}
