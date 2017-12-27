package com.javarush.task.task04.task0419;

/*
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int b = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int c = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int d = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println(returnMax(a, b, c, d));

    }

    public static int returnMax(int a, int b,int c, int d){
        int semiMax, semiMax1, semiMax2;
        if(a >= b)semiMax1 = a;
        else semiMax1 = b;
        if(c >= d)semiMax2 = c;
        else semiMax2 = d;
        if(semiMax1 >= semiMax2)semiMax = semiMax1;
        else semiMax = semiMax2;
        return semiMax;
    }
}
