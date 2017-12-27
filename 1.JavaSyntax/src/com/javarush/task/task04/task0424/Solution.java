package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int b = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int c = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        if(a !=  b && b == c)System.out.println("1");
            if(b !=  c && a == c)System.out.println("2");
                if(c != a && a==b)System.out.println("3");
    }
}
