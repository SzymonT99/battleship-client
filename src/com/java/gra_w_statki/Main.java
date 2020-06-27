package com.java.gra_w_statki;

import com.java.gra_w_statki.GUI.MenuGlowneGUI;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MenuGlowneGUI menuGlowneGUI = new MenuGlowneGUI();
                menuGlowneGUI.setVisible(true);
            }
        });
    }
}
