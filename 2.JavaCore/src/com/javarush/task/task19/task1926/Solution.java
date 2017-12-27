package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        //StringBuilder str = new StringBuilder();

        while (fileReader.ready()){
           // String s = fileReader.readLine();
            System.out.println(new StringBuilder(fileReader.readLine()).reverse());
        }

        reader.close();
        fileReader.close();
    }
}
