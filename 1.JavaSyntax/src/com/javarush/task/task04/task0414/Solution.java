package com.javarush.task.task04.task0414;

/*
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int x;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sYear = reader.readLine();
        int nYear = Integer.parseInt(sYear);

        if(nYear % 4 == 0)x = 366;
            else x = 365;
        if(nYear % 100 == 0 && nYear % 400 != 0)x = 365;

        System.out.println("количество дней в году: " + x);
    }
}