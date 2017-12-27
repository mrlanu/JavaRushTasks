package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream ir = new FileInputStream(s);
        int min = 256;
        while (ir.available() > 0){
            int data = ir.read();

            if (data < min)min = data;
        }
        ir.close();
        System.out.println(min);
    }
}
