
package com.javarush.task.task18.task1810;
/*
DownloadException
*/
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String filename = reader.readLine();
            FileInputStream stream = new FileInputStream(filename);
            if (stream.available() < 1000)
            {
                reader.close();
                stream.close();
                throw new DownloadException();
            }
            else {
                stream.close();
                //reader.close();
            }
        }
    }
    public static class DownloadException extends Exception {
    }
}