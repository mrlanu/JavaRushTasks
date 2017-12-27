package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();

        FileInputStream fis = new FileInputStream(f1);
        FileOutputStream fos = new FileOutputStream(f2);

        byte [] buff = new byte[fis.available()];

        int k = fis.read(buff);

        for (int i = 0; i < buff.length; i++){
            int j = buff.length - i - 1;
            byte b = buff[j];
            fos.write(b);
        }

        fis.close();
        fos.close();
        reader.close();


    }
}
