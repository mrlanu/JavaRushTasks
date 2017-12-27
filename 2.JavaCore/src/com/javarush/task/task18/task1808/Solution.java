package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos2 = new FileOutputStream(file2);
        FileOutputStream fos3 = new FileOutputStream(file3);

        int count = fis.available();
        int plus = 1;
        if (count % 2 == 0)count = count / 2;
        else count = (count / 2) + 1;

        while (fis.available() > 0){
            int data = fis.read();
            if (plus <= count)fos2.write(data);
            else fos3.write(data);
            plus++;
        }

        fis.close();
        fos2.close();
        fos3.close();

    }
}
