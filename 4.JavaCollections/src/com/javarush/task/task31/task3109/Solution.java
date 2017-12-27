package com.javarush.task.task31.task3109;

import java.io.*;
import java.util.Properties;

/* 
Читаем конфиги
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        Properties properties = solution.getProperties("src/com/javarush/task/task31/task3109/properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("src/com/javarush/task/task31/task3109/properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("src/com/javarush/task/task31/task3109/notExists");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName) throws IOException {
        Properties result = new Properties();
        String res = null;
        File fl = new File(fileName);
        String[] s = fl.getName().split("\\.");
        for (String st : s){
            res = st;
        }
        try {
            if (res.equals("xml")) {
                result.loadFromXML(new FileInputStream(fl));
            } else result.load(new FileReader(fl));
        }
        catch (IOException e){
            return result;
        }
        return result;
    }
}
