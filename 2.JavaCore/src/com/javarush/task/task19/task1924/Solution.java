package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        StringBuilder stringB = new StringBuilder();

        while (fileReader.ready()){
            String [] arrS = fileReader.readLine().split(" ");
            for (String s : arrS){
                stringB.append(zamena(s) + " ");
            }

        }

        System.out.println(stringB);
        reader.close();
        fileReader.close();
    }

    public static String zamena(String s){
        try {
            int sI = Integer.parseInt(s);
            if (sI >= 0 && sI <= 12){
                return map.get(sI);
            }
        }
        catch (NumberFormatException e){
            return s;
        }
        return s;
    }
}
