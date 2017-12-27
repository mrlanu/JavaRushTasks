package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sMin = reader.readLine();
        double nMin = Double.parseDouble(sMin);

        int i = (int)nMin / 5;
        double x = nMin - i * 5;

        if(x >= 0 && x < 3)System.out.println("зелёный");
        if(x >= 3 && x < 4)System.out.println("желтый");
        if(x >= 4 && x < 5)System.out.println("красный");
    }
}