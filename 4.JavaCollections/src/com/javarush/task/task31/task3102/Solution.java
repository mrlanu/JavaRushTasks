package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> result = new ArrayList<String>();
        Stack<File> kucha = new Stack<File>();

        kucha.push(new File(root));

        while (!kucha.empty()){
            File fl = kucha.pop();
            if (fl.isDirectory()){
                for (File f : fl.listFiles()){
                    kucha.push(f);
                }
            }
            else result.add(fl.getAbsolutePath());
        }

        return result;

    }

    public static void main(String[] args) throws IOException {
        List<String> prnt = getFileTree("c:\\txt");
        for (String s : prnt)System.out.println(s);
    }
}
