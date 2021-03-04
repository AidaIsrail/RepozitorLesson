package com.company;

public class Classwork2 {
    static void printtable2 (){
        for (int c = 1; c <= 10; c++) {
            int umnojenie = 2 * c;
            System.out.println(2 + "*" + c + " =" + umnojenie);
        }
    }
    static void print(String text){
        System.out.println(text);
    }
    static void printSum(int a, int b){
        System.out.println(a+b);
    }
    //int * int = int
    //int * double = double
    //
    public static void main(String[] args) {
// новая тема - методы и процедуры
//метод - ничего не возврщает, а процедура - возвращает
//        *** Напишите программу с использоанием процедур для вывода таблицы умножения на 2
        //добавить void tabl
            printtable2();
        System.out.println();
               print("Hello world");
        System.out.println();
        printSum(5, 8 );





    }
}
