package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name, address, color;
    int age, weight;

    public Cat(String name){
        this.name = name;
        this.age = 5;
        this.weight = 7;
        this.color = "White";
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "White";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 6;
        this.color = "Yellow";
    }

    public Cat(int weight, String color){
       // this.name = name;
        this.age = 5;
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address){
     //   this.name = name;
        this.age = 5;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}
