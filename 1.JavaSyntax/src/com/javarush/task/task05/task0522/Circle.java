package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код

    public Circle(){
        this.x = 6;
        this.y = 7;
        this.radius = 7;
    }

    public Circle(double x, double y){
        this(x, y, 8);
    }

    public Circle(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;

    }

    public Circle(double radius){
        this(7,8);
        this.radius = radius;
    }

    public static void main(String[] args) {

    }
}