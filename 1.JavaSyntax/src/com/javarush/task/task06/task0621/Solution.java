package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandPaName = reader.readLine();
        Cat catGrandPa = new Cat(grandPaName);

        String grandMaName = reader.readLine();
        Cat catGrandMa = new Cat(grandMaName);

        String papaName = reader.readLine();
        Cat catPapa = new Cat(papaName, null, catGrandPa);

        String mamaName = reader.readLine();
        Cat catMama = new Cat(mamaName, catGrandMa, null);

        String sinName = reader.readLine();
        Cat catSin = new Cat(sinName, catMama, catPapa);

        String dochName = reader.readLine();
        Cat catDoch = new Cat(dochName, catMama, catPapa);

        System.out.println(catGrandPa);
        System.out.println(catGrandMa);
        System.out.println(catPapa);
        System.out.println(catMama);
        System.out.println(catSin);
        System.out.println(catDoch);


    }

    public static class Cat {
        private String name;
        private Cat parent1;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent1, Cat parent2) {
            this.name = name;
            this.parent1 = parent1;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {
            if (parent1 == null && parent2 == null)
                return "Cat name is " + name + ", no mother " + ", no father";
            if (parent2 == null)
                return "Cat name is " + name + ", mother is " + parent1.name + ", no father";
            if (parent1 == null)
                return "Cat name is " + name + ", no mother " + ", father is " + parent2.name;
            if (parent1 != null && parent2 != null)
                return "Cat name is " + name + ", mother is " + parent1.name + ", father is " + parent2.name;
            return null;

        }
    }

}
