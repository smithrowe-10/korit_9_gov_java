package com.korit.study.ch34;

import javax.swing.*;

public class FormMain {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("FirstForm");
        jFrame.setContentPane(new FirstForm().getPanel1());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
