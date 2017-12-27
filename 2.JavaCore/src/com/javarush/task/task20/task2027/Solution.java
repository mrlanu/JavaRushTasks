package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/*
Кроссворд
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        List<Word> wrd = detectAllWords(crossword, "home", "same", "emoh", "emas", "fderlk", "klredf",
                "fulmp", "poeejj", "jjeeop", "pmluf", "kovhj", "jhvok", "lprr", "rrpl", "lprr", "voel",
                "lock", "r", "re", "eo", "oe", null, "", " ","vo","plgml","plgmlp","jrrad","kerpo","fsgrj","mgl","rgs","sgr");

        for (Word w : wrd) System.out.println(w);
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {

        String s;
        Word wr;
        List<Word> arrL = new ArrayList<>();

        for (int p = 0; p < words.length; p++) {

            int count = 1;

            if (words[p]!=null && words[p]!="")s = words[p];
            else continue;

            for (int i = 0; i < crossword.length; i++){
                for (int j = 0; j < crossword[i].length; j++){
                    if (s.charAt(0) == crossword[i][j]) {
                        //ONE Symbol
                        if (s.length()==1){
                            wr = new Word(s);
                            wr.setStartPoint(j, i);
                            wr.setEndPoint(j, i);
                            arrL.add(wr);
                        }
                        //UP
                        if (i + 1 - s.length() >= 0){
                            for (int x = 1; x < s.length(); x++){
                                if (s.charAt(x) == crossword[i - x][j]){
                                    count++;
                                    if(count == s.length()){
                                        wr = new Word(s);
                                        wr.setStartPoint(j, i);
                                        wr.setEndPoint(j, (i-x));
                                        arrL.add(wr);
                                    }
                                }
                                else {count = 1; break;}
                            }
                        }
                        //DOWN
                        if (i + s.length() <= crossword.length){
                            for (int x = 1; x < s.length(); x++){
                                if (s.charAt(x) == crossword[i + x][j]){
                                    count++;
                                    if(count == s.length()){
                                        wr = new Word(s);
                                        wr.setStartPoint(j, i);
                                        wr.setEndPoint(j, (i+x));
                                        arrL.add(wr);
                                    }
                                }
                                else{count=1;break;}
                            }
                        }
                        //RIGHT
                        if (j + s.length() <= crossword[i].length){
                            for (int x = 1; x < s.length(); x++){
                                if (s.charAt(x) == crossword[i][j+x]){
                                    count++;
                                    if(count == s.length()){
                                        wr = new Word(s);
                                        wr.setStartPoint(j, i);
                                        wr.setEndPoint(j+x, i);
                                        arrL.add(wr);
                                    }
                                }
                                else {count = 1; break;}
                            }
                        }
                        //LEFT
                        if (j + 1 - s.length() >= 0){
                            for (int x = 1; x < s.length(); x++){
                                if (s.charAt(x) == crossword[i][j-x]){
                                    count++;
                                    if(count == s.length()){
                                        wr = new Word(s);
                                        wr.setStartPoint(j, i);
                                        wr.setEndPoint(j-x, i);
                                        arrL.add(wr);
                                    }
                                }
                                else {count = 1; break;}
                            }
                        }
                        //UP+RIGHT
                        if (i + 1 - s.length() >= 0 && j + 1 + s.length() <= crossword[i].length){
                            for (int x = 1; x < s.length(); x++){
                                if (s.charAt(x) == crossword[i - x][j+x]){
                                    count++;
                                    if(count == s.length()){
                                        wr = new Word(s);
                                        wr.setStartPoint(j, i);
                                        wr.setEndPoint(j+x, i-x);
                                        arrL.add(wr);
                                    }
                                }
                                else {count = 1; break;}
                            }
                        }
                        //DOWN+RIGHT
                        if (i + s.length() <= crossword.length && j + s.length() <= crossword[i].length){
                            for (int x = 1; x < s.length(); x++){
                                if (s.charAt(x) == crossword[i + x][j+x]){
                                    count++;
                                    if(count == s.length()){
                                        wr = new Word(s);
                                        wr.setStartPoint(j, i);
                                        wr.setEndPoint(j+x, i+x);
                                        arrL.add(wr);
                                    }
                                }
                                else {count = 1; break;}
                            }
                        }
                        //DOWN+LEFT
                        if (i + s.length() <= crossword.length && j + 1 - s.length() >= 0){
                            for (int x = 1; x < s.length(); x++){
                                if (s.charAt(x) == crossword[i + x][j-x]){
                                    count++;
                                    if(count == s.length()){
                                        wr = new Word(s);
                                        wr.setStartPoint(j, i);
                                        wr.setEndPoint(j-x, (i+x));
                                        arrL.add(wr);
                                    }
                                }
                                else {count = 1; break;}
                            }
                        }
                        //UP+LEFT
                        if (i + 1 - s.length() >= 0 && j + 1 - s.length() >= 0){
                            for (int x = 1; x < s.length(); x++){
                                if (s.charAt(x) == crossword[i - x][j-x]){
                                    count++;
                                    if(count == s.length()){
                                        wr = new Word(s);
                                        wr.setStartPoint(j, i);
                                        wr.setEndPoint(j-x, (i-x));
                                        arrL.add(wr);
                                    }
                                }
                                else {count = 1; break;}
                            }
                        }
                    }
                }
            }
        }
        // for (Word w : arrL)System.out.println(w);
        return arrL;
    }



    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
