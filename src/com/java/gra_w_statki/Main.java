package com.java.gra_w_statki;

import com.java.gra_w_statki.GUI.GraGUI;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GraGUI graGUI = new GraGUI();
                graGUI.setVisible(true);
            }
        });
    }
}
