package com.javarush.task.task18.task1801;

import java.io.*;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream ir = new FileInputStream(s);
        int max = 0;
        while (ir.available() > 0){
            int data = ir.read();

            if (data > max)max = data;
        }
        ir.close();
        System.out.println(max);
    }
}
