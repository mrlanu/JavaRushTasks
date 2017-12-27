package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Serhiy", 37, "horostkiv");
        Man man2 = new Man("Vasya", 23, "Kotivka");
        Woman woman1 = new Woman("Valya",21, "Kozova");
        Woman woman2 = new Woman("Masha", 22,"zolochiv");
        man1.toStr();
        man2.toStr();
        woman1.toStr();
        woman2.toStr();
    }

    //напишите тут ваш код
    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void toStr(){
            System.out.println(name + " " + age + " " + address);
        }
    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public void toStr(){
            System.out.println(name + " " + age + " " + address);
        }
    }
}
