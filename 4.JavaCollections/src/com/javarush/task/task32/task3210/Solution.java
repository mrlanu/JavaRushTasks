package com.javarush.task.task32.task3210;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {
        String file = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];

        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")){
            byte[] buffer = new byte[text.length()];
            raf.seek(number);
            raf.read(buffer, 0, buffer.length);
            String strFromFile = convertByteToString(buffer);
            String result = strFromFile.equals(text) ? "true" : "false";
            raf.seek(raf.length());
            raf.write(result.getBytes());
        }
    }

    public static String convertByteToString (byte readBytes[]) {
        //return new String(readBytes, StandardCharsets.UTF_8);
        return new String(readBytes);
    }
}
