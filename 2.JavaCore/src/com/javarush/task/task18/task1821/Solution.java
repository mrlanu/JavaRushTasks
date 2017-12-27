package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(args [0]);

        int [] arr1 = new int[127];
        int hz = 0;

        while (fis.available() > 0){

            arr1[fis.read()]++;
        }

        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] != 0)System.out.println((char)i + " " + arr1[i]);
        }
        fis.close();


    }
}
