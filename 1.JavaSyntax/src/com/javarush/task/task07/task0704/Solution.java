package com.javarush.task.task07.task0704;

//import com.intellij.codeInspection.bytecodeAnalysis.Direction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] massiv = initializeArr();

        for(int i = massiv.length - 1; i >= 0; i--)System.out.println(massiv[i]);
    }

    public static int [] initializeArr() throws IOException {

        int [] arr = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < arr.length; i++){
            int s = Integer.parseInt(reader.readLine());
            arr[i] = s;
        }
        return arr;
    }
}

