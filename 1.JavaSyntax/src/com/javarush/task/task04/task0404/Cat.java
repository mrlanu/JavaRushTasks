package com.javarush.task.task04.task0404;

/* 
Реализовать метод addNewCat
*/

public class Cat {
    private static int catsCount = 0;

    public static void addNewCat() {
        //напишите тут ваш к
        Cat.catsCount += 1;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.addNewCat();
        cat2.addNewCat();
        System.out.println(Cat.catsCount);
    }
}
