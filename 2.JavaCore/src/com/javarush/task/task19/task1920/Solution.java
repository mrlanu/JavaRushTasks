package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> data = new TreeMap<>();

        while (reader.ready()){
            String[] s = reader.readLine().split(" ");
            if (data.containsKey(s[0])){
                data.put(s[0], data.get(s[0]) + Double.parseDouble(s[1]));
            }
            else data.put(s[0], Double.parseDouble(s[1]));
        }
        reader.close();

        Double max = 0.0;

        for (Map.Entry<String, Double> m : data.entrySet()){
            Double val = m.getValue();
            if (val > max)max = val;
        }

        for (Map.Entry<String, Double> m : data.entrySet()){
            if (m.getValue().equals(max))System.out.println(m.getKey());

        }
    }
}
