package com.java.gra_w_statki.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraGUI extends JFrame implements ActionListener{
    private JButton b12;
    private JButton b2;
    private JButton b56;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b10;
    private JButton b13;
    private JButton b14;
    private JButton b15;
    private JButton b16;
    private JButton b17;
    private JButton b18;
    private JButton b19;
    private JButton b20;
    private JButton b22;
    private JButton b23;
    private JButton b24;
    private JButton b25;
    private JButton b26;
    private JButton b27;
    private JButton b28;
    private JButton b29;
    private JButton b30;
    private JButton b32;
    private JButton b33;
    private JButton b34;
    private JButton b35;
    private JButton b36;
    private JButton b37;
    private JButton b38;
    private JButton b39;
    private JButton b40;
    private JButton b42;
    private JButton b43;
    private JButton b44;
    private JButton b45;
    private JButton b46;
    private JButton b47;
    private JButton b48;
    private JButton b49;
    private JButton b50;
    private JButton b52;
    private JButton b53;
    private JButton b54;
    private JButton b55;
    private JButton b57;
    private JButton b58;
    private JButton b59;
    private JButton b60;
    private JButton b62;
    private JButton b63;
    private JButton b64;
    private JButton b65;
    private JButton b66;
    private JButton b67;
    private JButton b68;
    private JButton b69;
    private JButton b70;
    private JButton b72;
    private JButton b73;
    private JButton b74;
    private JButton b75;
    private JButton b76;
    private JButton b77;
    private JButton b78;
    private JButton b79;
    private JButton b80;
    private JButton b82;
    private JButton b83;
    private JButton b84;
    private JButton b85;
    private JButton b86;
    private JButton b87;
    private JButton b88;
    private JButton b89;
    private JButton b90;
    private JButton b92;
    private JButton b93;
    private JButton b94;
    private JButton b95;
    private JButton b96;
    private JButton b97;
    private JButton b98;
    private JButton b99;
    private JButton b100;
    private JButton b1;
    private JButton b11;
    private JButton b21;
    private JButton b31;
    private JButton b41;
    private JButton b51;
    private JButton b61;
    private JButton b71;
    private JButton b81;
    private JButton b91;
    private JButton ustawStatkiButton;
    private JButton wyjdzZGryButton;
    private JButton przerwijGreButton;
    private JPanel mainPanel;

    public GraGUI() {
        add(mainPanel);
        setTitle("Gra w statki");
        setBounds(540, 150, 920, 730);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        b1.setName("b1");
        b2.setName("b2");
        b3.setName("b3");
        b4.setName("b4");
        b5.setName("b5");
        b6.setName("b6");
        b7.setName("b7");
        b8.setName("b8");
        b9.setName("b9");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);


    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton pom;
        pom = (JButton) e.getSource();
        System.out.println(pom.getName());
    }
}
