package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    protected static int minS = 0;
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> listArr = initializeArr();
        for(int i = 0; i < listArr.size(); i++){
            if(listArr.get(i).length() == minS)System.out.println(listArr.get(i));
        }
    }

    public static ArrayList<String> initializeArr()throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> listic = new ArrayList<String>();
        boolean x = true;
        for(int i = 0; i < 5; i++){
            listic.add(reader.readLine());
            if(x == true){minS = listic.get(i).length(); x = false;}
            if(listic.get(i).length() <= minS)minS = listic.get(i).length();
        }
        return listic;
    }
}
