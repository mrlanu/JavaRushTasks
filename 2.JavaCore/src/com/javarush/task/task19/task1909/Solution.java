package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        BufferedReader read = new BufferedReader(new FileReader(fileName1));
        BufferedWriter wright = new BufferedWriter(new FileWriter(fileName2));

        while (read.ready()){
            int data = read.read();
            if (data == 46)wright.write(33);
            else wright.write(data);
        }

        reader.close();
        read.close();
        wright.close();
    }

}
