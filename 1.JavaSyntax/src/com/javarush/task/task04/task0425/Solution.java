package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int x = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int y = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        System.out.println(getPlace(x, y));
    }

    public static int getPlace(int a, int b)
    {
        int place=0;
       if(a > 0 && b > 0)place = 1;
        if(a < 0 && b > 0)place = 2;
        if(a < 0 && b < 0)place = 3;
        if(a > 0 && b < 0)place = 4;
       return place;
    }
}
