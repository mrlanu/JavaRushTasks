package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message){
        System.out.println(message);
    }

    public static String readString(){

        while (true) {
            try {
                return reader.readLine();
            } catch (IOException e) {
               writeMessage("Error - " + e.getMessage());
            }
        }
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> dishes = new ArrayList<>();

        while (true) {
            String s = Dish.allDishesToString();
            writeMessage(s);
            writeMessage("Please chose a dish ?");
            String tempName = readString();
            if (tempName.equals("exit"))break;
            else if (s.contains(tempName)){
            for (Dish d : Dish.values()){
                if (d.name().equals(tempName)){
                    dishes.add(d);
                    writeMessage("Dish - " + tempName + " added to order.");
                }
            }}else writeMessage("We don't have such a dish, please try again...");
        }

        return dishes;
    }
}
