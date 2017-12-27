package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name1 = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String name2 = new BufferedReader(new InputStreamReader(System.in)).readLine();

        if(name1.equals(name2))System.out.println("Имена идентичны");
        else if(name1.length()==name2.length())System.out.println("Длины имен равны");
    }
}
