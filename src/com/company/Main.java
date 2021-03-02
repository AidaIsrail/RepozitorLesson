package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// тернальный оператор - ускоряет if-else
//добавили комментарий для гитхаба

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int M = a > b ? a : b; //? -  означает тернарный оператор,
        // т.е. стоит вопрос а больше b? далее действие,
        // если ответ а больше, то ответ а, , если b больше, то ответ выйдет b
        System.out.println(M);
    }
}
