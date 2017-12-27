package com.javarush.task.task23.task2305;

/* 
Inner
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution [] result = new Solution[2];
        Solution ob1 = new Solution();
        Solution ob2 = new Solution();

        ob1.innerClasses[0] = ob1.new InnerClass();
        ob1.innerClasses[1] = ob1.new InnerClass();
        ob2.innerClasses[0] = ob2.new InnerClass();
        ob2.innerClasses[1] = ob2.new InnerClass();

        result[0] = ob1;
        result[1] = ob2;

        return result;
    }

    public static void main(String[] args) {

    }
}
