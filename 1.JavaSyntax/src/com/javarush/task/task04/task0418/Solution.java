package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int b = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        if(a < b)System.out.println(a);
            else System.out.println(b);
    }
}