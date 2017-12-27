package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String [] strArr = initializeStrArr();
        initializeInArr(strArr);
    }

    public static String [] initializeStrArr() throws IOException{

        String [] arr = new String[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < arr.length; i++){
            String s = reader.readLine();
            arr[i] = s;
        }
        return arr;
    }

    public static void initializeInArr(String[] arra) throws IOException{

        int [] arr = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < arr.length; i++){
            arr[i] = arra[i].length();
            System.out.println(arr[i]);
        }

    }
}
