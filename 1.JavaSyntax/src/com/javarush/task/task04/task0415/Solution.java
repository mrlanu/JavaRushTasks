package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        boolean yes = false;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();

        int nA = Integer.parseInt(sA);
        int nB = Integer.parseInt(sB);
        int nC = Integer.parseInt(sC);

        if(nA + nB > nC)
            if(nB + nC > nA)
                if(nC + nA > nB)yes = true;

        if(yes == true)System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");

    }
}