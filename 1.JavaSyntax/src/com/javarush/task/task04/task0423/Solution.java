package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш кодage
        String name = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int age = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        if(age > 20)System.out.println("И 18-ти достаточно");
    }
}
