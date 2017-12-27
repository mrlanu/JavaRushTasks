package com.javarush.task.task04.task0412;

/*
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber = reader.readLine();
        int nNumber = Integer.parseInt(sNumber);

        if(nNumber > 0)nNumber = nNumber * 2;
        if(nNumber < 0)nNumber = nNumber + 1;
        if (nNumber == 0)nNumber = 0;

        System.out.println(nNumber);



    }

}