package com.javarush.task.task04.task0422;

/* 
18+
*/



import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int age = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        if(age < 18)System.out.println("Подрасти еще");
    }

}
