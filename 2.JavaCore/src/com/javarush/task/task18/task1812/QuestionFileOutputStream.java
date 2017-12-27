package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream amast;

    public QuestionFileOutputStream(AmigoOutputStream amast) {
        this.amast = amast;
    }

    @Override
    public void flush() throws IOException {
        amast.flush();
    }

    @Override
    public void write(int b) throws IOException {
        amast.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        amast.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        amast.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Вы действительно хотите закрыть поток? Д/Н");
            String s = reader.readLine();
            if (s.equals("Д"))amast.close();
            reader.close();
         //   if (s.equals("Н"))
    }
}

