package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Date dat = new Date();

        while (reader.ready()){
            String data = reader.readLine();
            String name = data.split(" \\d")[0];
            String bday = data.split(name + " ")[1];

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            Date date = dateFormat.parse(bday);
            PEOPLE.add(new Person(name, date));

        }

        reader.close();


    }
}
