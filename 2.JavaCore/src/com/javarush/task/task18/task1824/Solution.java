package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{
        ArrayList<FileInputStream> arr =new ArrayList<FileInputStream>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){

            String s = reader.readLine();
            try {
                arr.add(new FileInputStream(s));
            }
            catch (FileNotFoundException e){
                System.out.println(s);
                break;
            }
        }

        for (FileInputStream e : arr){
            e.close();
        }
        reader.close();
    }
}
