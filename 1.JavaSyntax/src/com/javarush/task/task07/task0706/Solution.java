package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] domArr = initializeArr();
        countPeople(domArr);
    }

    public static int [] initializeArr() throws IOException{
        int [] mass = new int [15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < mass.length; i++){
            int s = Integer.parseInt(reader.readLine());
            mass[i] = s;
        }
        return mass;
    }

    public static void countPeople(int[] arr)throws IOException{
        int countChet = 0, countNeChet = 0;

        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0)countChet = countChet + arr[i];
                else countNeChet = countNeChet + arr[i];
        }

        if(countChet < countNeChet)System.out.println("В домах с нечетными номерами проживает больше жителей.");
            else System.out.println("В домах с четными номерами проживает больше жителей.");

    }
}
