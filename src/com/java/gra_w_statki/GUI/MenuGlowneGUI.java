package com.java.gra_w_statki.GUI;


import com.java.gra_w_statki.Kontrolery.HttpClientGET;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuGlowneGUI extends JFrame {

    private JPanel mainPanel;
    private JTextField nazwaText;
    private JButton grajButtton;
    private JLabel nazwaLabel;
    private JLabel komunikat;
    private JButton grajButton;
    private HttpClientGET klient = new HttpClientGET();

    public MenuGlowneGUI() {
        add(mainPanel);
        setTitle("Menu główne");
        setBounds(810, 250, 450, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        grajButtton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nazwaGracza = nazwaText.getText();

                if (nazwaGracza.equals("")) {
                    komunikat.setText("Podaj nazwe gracza");
                }
                else {
                    try {
                        klient.wyślijNazweGracza(nazwaGracza);
                        if (klient.sprzwdzTrybSerwera() != 1) {
                            klient.ustawTryb(1);
                            GraGUI graGUI = new GraGUI();
                            graGUI.setVisible(true);
                        } else komunikat.setText("Na serwerze już trwa ten tryb");
                    }catch (Exception ex){
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(mainPanel, "Brak połączenia z serwerem");
                    }
                }
            }
        });
    }
}
