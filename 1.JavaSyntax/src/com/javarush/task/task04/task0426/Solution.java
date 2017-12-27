package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int number = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        String chetNechet = "", plusMinus = "";


        if(number == 0)System.out.println("ноль");
        else {
            if (number % 2 == 0) chetNechet = "четное";
            else chetNechet = "нечетное";

            if (number < 0) plusMinus = "отрицательное";
            if (number > 0) plusMinus = "положительное";

            System.out.println(plusMinus + " " + chetNechet + " число");
        }

    }
}
