package com.company;

import java.util.Scanner;

public class classwork1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        if(command.equals("quit")){
            System.out.println("Goodbye");
            //break;
            System.exit(0);
        }
        else{
            System.out.println("You used this command:\n\"" + command );
        }
        while(true){
            System.out.println("You used this command:\n" + command);
        }

    }
}
