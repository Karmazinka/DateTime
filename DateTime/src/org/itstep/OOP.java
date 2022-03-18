package org.itstep;

import java.util.Scanner;

public class OOP {
    static int number;
    static int result;

    public static void main(String[] args) {
        input();
        calc();
        print();
    }

    static void input(){
        Scanner scanner = new Scanner(
                System.in
        );
        System.out.println("Введите число: ");
        number = scanner.nextInt();
    }

    static void calc(){
        result = number*2;
    }

    static void print(){

        System.out.println("Answer:"+result);
    }
}
