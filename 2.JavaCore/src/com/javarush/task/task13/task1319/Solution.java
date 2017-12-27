package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

        String stroka = reader.readLine();
        bw.write(stroka + "\n");

        while (!stroka.equals("exit")){
            stroka = reader.readLine();
            bw.write(stroka + "\n");
        }

        reader.close();
        bw.close();

    }
}
