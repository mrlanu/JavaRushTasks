package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream ir = new FileInputStream(s);
       int mass[] = new int [256];
        while (ir.available() > 0){
            int data = ir.read();
            mass[data] = data;
        }
        ir.close();
        for (int i : mass){
            if (i != 0)System.out.print(i + " ");
        }
    }
}
