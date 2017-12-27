package com.javarush.task.task04.task0427;

/*
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String sNumber = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int dlina = sNumber.length();
        int nNumber = Integer.parseInt(sNumber);
        String znach = "", nechet ="";

        if(nNumber >= 1 && nNumber <= 999)
        {
            if(dlina == 1)znach = "однозначное";
            if(dlina == 2)znach = "двузначное";
            if(dlina == 3)znach = "трехзначное";

            if(nNumber % 2 == 0)nechet = "четное";
            else nechet = "нечетное";
            System.out.println(nechet + " " + znach + " число");
        }
    }
}
