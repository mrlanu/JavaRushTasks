package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    int top, left, width, height;

    public Rectangle(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left){
        this(top, left, 0, 0);
    }

    public Rectangle(int top, int left, int width){
        this(top, left, width, width);
    }

    public Rectangle(Rectangle rec){
        
    }
    public static void main(String[] args) {

    }
}
