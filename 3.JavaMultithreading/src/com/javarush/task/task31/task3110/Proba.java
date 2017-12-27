package com.javarush.task.task31.task3110;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Proba implements ActionListener {

    JButton button;

    public static void main(String [] args) throws IOException {

        Proba proba = new Proba();
        proba.go();
    }

    public void go(){

        JFrame frame = new JFrame();
        button = new JButton("Click me");
        button.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been cklicked !");
    }
}
