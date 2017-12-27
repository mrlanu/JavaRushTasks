package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        String path = reader.readLine();

        InputStream inS = new FileInputStream(path);
        while(inS.available() > 0) {

            System.out.print((char)inS.read());

        }

        inS.close();
        reader.close();
        System.out.println();



    }
}