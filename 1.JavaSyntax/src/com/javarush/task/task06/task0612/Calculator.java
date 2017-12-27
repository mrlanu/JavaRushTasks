package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        int c  = a + b;

        return c;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        int c = a - b;
        return c;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        int c = a * b;
        return c;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        double q = a;
        double w = b;
        double s = q/w;
        return s;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        double c  = (a * b) / 100;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(division(55,10));
    }
}