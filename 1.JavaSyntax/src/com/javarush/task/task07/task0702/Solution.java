package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] myArr = initializeArr();
        printArr(myArr);
    }

    public static String[] initializeArr()throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] list = new String[10];
        for(int i = 0; i < list.length - 2; i++){
            String s = reader.readLine();
            list[i] = s;
        }
        return list;
    }

    public static void printArr(String[] array){
        for(int i = array.length -1; i >= 0; i--) System.out.println(array[i]);
    }
}