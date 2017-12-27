package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> mainList = new ArrayList<Integer>();
        ArrayList<Integer> firstList = new ArrayList<Integer>();
        ArrayList<Integer> secondList = new ArrayList<Integer>();
        ArrayList<Integer> thirdList = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++){
            mainList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < mainList.size(); i++){
            if(mainList.get(i) % 3 == 0)firstList.add(mainList.get(i));
                if(mainList.get(i) % 2 == 0)secondList.add(mainList.get(i));
                    if(mainList.get(i) % 3 != 0 && mainList.get(i) % 2 != 0)thirdList.add(mainList.get(i));
        }

        printList(firstList);
        printList(secondList);
        printList(thirdList);

    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
