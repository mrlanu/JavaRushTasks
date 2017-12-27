package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
        int a = Integer.parseInt(read.readLine());
        int b = Integer.parseInt(read.readLine());
        int c = Integer.parseInt(read.readLine());
        if( (a == b) && (a == c)){
            System.out.println(a + " " + b + " " + c);
        }
        if( (a == b) && (a!=c) ){
            System.out.println(a + " " + b);
        }
        if( (a == c) && (a!=b)){
            System.out.println(a + " " + a);
        }
        if( (b == c) && (b!=a) && (c!=a) ){
            System.out.println(b + " " + c);
        }
    }


}