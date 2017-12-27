package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        System.out.println("jbub");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      //  String s1 = reader.readLine();
      //  String s2 = reader.readLine();
     //   String s3 = reader.readLine();

        FileOutputStream fos1 = new FileOutputStream("c:/txt/txt.txt", true);
        FileInputStream fis2 = new FileInputStream("c:/txt/txt2.txt");
        FileInputStream fis3 = new FileInputStream("c:/txt/txt3.txt");

        while (fis2.available() > 0){
            int dat = fis2.read();
            fos1.write(dat);
        }
        while (fis3.available() > 0){

            fos1.write(fis3.read());
        }

        fis2.close();
        fis3.close();
        fos1.close();
        reader.close();
    }
}
