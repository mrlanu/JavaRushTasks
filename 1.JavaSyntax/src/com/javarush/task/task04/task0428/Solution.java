package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int number1 = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int number2 = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int number3 = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        int a = 0;
        if(number1 > 0)a++;
        if(number2 > 0)a++;
        if(number3 > 0)a++;

        System.out.println(a);



    }
}
