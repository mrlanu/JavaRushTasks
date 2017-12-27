package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        BufferedReader stroca = new BufferedReader(new FileReader(file));

        while (stroca.ready()){
            int count = 0;
            String result = stroca.readLine();
            String[] s = result.split(" ");
            for (String x : words){
                for (String c : s){
                    if (c.equals(x))count++;
                }
            }
            if (count == 2)System.out.println(result);

        }
        stroca.close();

    }
}
