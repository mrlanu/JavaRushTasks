package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] largeArr = initializeArr();
        int [] firstSmalArr = initializeSmallArr(largeArr);
        int [] secondSmalArr = initializeSmallArr2(largeArr);
        printArr(secondSmalArr);
    }

    public static int [] initializeArr()throws IOException{
        int [] arr = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < arr.length; i++){
            int s = Integer.parseInt(reader.readLine());
            arr[i] = s;
        }
        return arr;
    }

    public static int [] initializeSmallArr(int [] arr)throws IOException{
        int [] smalArr = new int [10];

        for(int i = 0; i < smalArr.length; i++){
            smalArr[i] = arr[i];
        }
        return smalArr;
    }

    public static int [] initializeSmallArr2(int [] arr)throws IOException{
        int [] smalArr = new int [10];

        for(int i = 0; i < smalArr.length; i++){
            smalArr[i] = arr[i+10];
        }
        return smalArr;
    }

    public static void printArr(int[] arr)throws IOException{
        for(int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
