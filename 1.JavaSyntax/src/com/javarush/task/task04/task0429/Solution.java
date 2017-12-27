package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int number1 = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int number2 = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int number3 = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        int a = 0, b = 0;
        if(number1 < 0)a++;
        if(number1 > 0) b++;
        if(number2 < 0)a++;
        if(number2 > 0)b++;
        if(number3 < 0)a++;
        if(number3 > 0)b++;


        System.out.println("количество отрицательных чисел: " + a);
        System.out.println("количество положительных чисел: " + b);

    }
}



