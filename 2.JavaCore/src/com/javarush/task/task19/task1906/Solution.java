package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileReader fr = new FileReader(file1);
        FileWriter fw = new FileWriter(file2);

        int i = 1;

        while (fr.ready()){
            int data = fr.read();
            if (i % 2 == 0)fw.write(data);
            i++;
        }

        reader.close();
        fw.close();
        fr.close();
    }
}
