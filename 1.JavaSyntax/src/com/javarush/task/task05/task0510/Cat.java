package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    protected String name;
    protected int age;
    protected int weight;
    protected String address;
    protected String color;

    public void initialize(String name){
        this.name = name;
        this.age = 5;
        this.weight = 10;
        this.color = "grey";
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "grey";
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.color = "grey";
    }

    public void initialize(int weight, String color){
        this.age = 7;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address){
        this.age = 6;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}
