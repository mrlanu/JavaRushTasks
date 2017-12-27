package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        double average = 0, sIm = 0;
        int count = 0;
        while (true)
        {
            String s = buffer.readLine();
            double sI = Double.parseDouble(s);
            if (s.equals("-1"))
                break;
            sIm = sIm + sI;
            count++;
            average = sIm / count;

        }
        System.out.println(average);
    }
}

