package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        //напишите тут ваш код
        double a = (i * 10.0) / 100 + i;
        return a;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
