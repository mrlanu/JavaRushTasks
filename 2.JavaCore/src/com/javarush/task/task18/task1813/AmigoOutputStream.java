package com.javarush.task.task18.task1813;







import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    private FileOutputStream fis;
    public static String fileName = "C:/tmp/result.txt";

    public AmigoOutputStream(FileOutputStream fis) throws FileNotFoundException {
        super(fileName);
        this.fis = fis;
    }

    @Override
    public void flush() throws IOException {
        fis.flush();
    }

    @Override
    public void write(int b) throws IOException {
        fis.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fis.write(b, off, len);
    }

    @Override
    public void write(byte[] b) throws IOException {
        fis.write(b);
    }

    @Override
    public void close() throws IOException {
        fis.flush();
        fis.write("JavaRush © All rights reserved.".getBytes());
        fis.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
