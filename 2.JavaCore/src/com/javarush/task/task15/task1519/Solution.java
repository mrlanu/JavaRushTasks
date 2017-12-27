package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        while (!s.equals("exit")){
            int i = s.indexOf(".");
            if (i >= 0 && isDouble(s)){
                print(Double.parseDouble(s));
                s = reader.readLine();
                continue;
            }
            if (isShort(s)){
                if (Short.parseShort(s) > 0 && Short.parseShort(s) < 128){
                    print(Short.parseShort(s));
                    s = reader.readLine();
                    continue;
                }
            }
            if (isInt(s)) {
                if (Integer.parseInt(s) <= 0 || Integer.parseInt(s) >= 128) {
                    print(Integer.parseInt(s));
                    s = reader.readLine();
                    continue;
                }
            }
            if (!s.equals("exit"))print(s);
            s = reader.readLine();

        }

        reader.close();
    }

    public static boolean isDouble(String dou){
        try {
            Double d = Double.parseDouble(dou);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public static boolean isInt(String dou){
        try {
            Integer d = Integer.parseInt(dou);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public static boolean isShort(String dou){
        try {
            Short d = Short.parseShort(dou);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
