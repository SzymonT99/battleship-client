package com.java.gra_w_statki.GUI;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuGlowneGUI extends JFrame {

    private JPanel mainPanel;
    private JButton zalogujButton;
    private JButton zarejestrujButton;
    private JButton kontoButton;
    private JButton grajButton;
    private JLabel infoLabel;

    public MenuGlowneGUI() {
        add(mainPanel);
        setTitle("Menu główne");
        setBounds(810, 250, 450, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        grajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GraGUI graGUI = new GraGUI();
                graGUI.setVisible(true);
            }
        });
    }
}
