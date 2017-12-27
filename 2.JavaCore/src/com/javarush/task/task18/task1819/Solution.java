package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream fis = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);
        reader.close();
        byte [] fil1 = new byte [fis.available()];
        byte [] fil2 = new byte[fis2.available()];
            int data = fis.read(fil1,0,fis.available());
            int data2 = fis2.read(fil2,0,fis2.available());
            fis.close();
            fis2.close();
        FileOutputStream fos1 = new FileOutputStream(file1);
            fos1.write(fil2);
            fos1.close();
        FileOutputStream fos2 = new FileOutputStream(file1,true);
            fos2.write(fil1);
            fos2.close();

    }
}
