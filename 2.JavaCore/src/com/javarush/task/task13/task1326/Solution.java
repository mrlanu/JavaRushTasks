package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
       // int inS = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();


        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        while (read.ready()) {
            arr.add(Integer.parseInt(read.readLine()));

        }

        Collections.sort(arr);

        for (int i : arr){
            if (i % 2 == 0)System.out.println(i);
        }
        reader.close();
        read.close();
    }
}
