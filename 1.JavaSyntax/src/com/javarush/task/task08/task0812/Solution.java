package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        //ArrayList<Integer> aList = initializeAList(10);
        //solutionArr(aList);
        //System.out.println(solutionArr(aList));
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 1;
        int count = 1;
        for(int i = 0; i < 10; i ++)  {
            int a = Integer.parseInt(reader.readLine());
            list.add(a);
            if(i > 0 && list.get(i) == list.get(i - 1)) {
                count ++;
                if(count > max) max = count;
            }else count = 1;
        }
        System.out.println(max);
    }

       // System.out.println(max);







}