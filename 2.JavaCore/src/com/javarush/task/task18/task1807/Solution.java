package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException{
        long count = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fi = new FileInputStream(fileName);

        while (fi.available() > 0){
            int symb = fi.read();
            if (symb == 44)count++;
        }

        fi.close();
        System.out.println(count);
    }
}
