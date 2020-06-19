package com.java.gra_w_statki.GUI;

import com.java.gra_w_statki.Kontrolery.HttpClientGET;
import com.java.gra_w_statki.Model.Plansza;
import com.java.gra_w_statki.Model.Pole;
import com.java.gra_w_statki.Model.Statek;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class GraGUI extends JFrame implements ActionListener{
    private JButton b12;
    private JButton b02;
    private JButton b56;
    private JButton b03;
    private JButton b04;
    private JButton b05;
    private JButton b06;
    private JButton b07;
    private JButton b08;
    private JButton b09;
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
    private JButton b01;
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
    private JLabel komunikatLabel;

    private HttpClientGET klient = new HttpClientGET();
    private Plansza planszaGracza;
    private Statek statek2 = new Statek(1, 2);
    private Statek statek3_1 = new Statek(2, 3);
    private Statek statek3_2 = new Statek(3, 3);
    private Statek statek4 = new Statek(4, 4);
    private Statek statek5 = new Statek(5, 5);
    private Integer hp = 1;


    public GraGUI() {
        add(mainPanel);
        setTitle("Gra w statki");
        setBounds(540, 150, 920, 730);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton[] tabPrzyciskow = {b01, b02, b03, b04, b05, b06, b07, b08, b09, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36, b37,
                b38, b39, b40, b41, b42, b43, b44, b45, b46, b47, b48, b49, b50, b51, b52, b53, b54, b55, b56, b57, b58, b59, b60, b61, b62, b63, b64, b65, b66, b67, b68, b69, b70, b71, b72, b73, b74, b75,
                b76, b77, b78, b79, b80, b81, b82, b83, b84, b85, b86, b87, b88, b89, b90, b91, b92, b93, b94, b95, b96, b97, b98, b99, b100};

        ArrayList<Pole> polaPlanszy = new ArrayList<>();
        int i = 0;
        for(JButton button : tabPrzyciskow){
            if(i < 10) {
                for (int j = 1; j < 10; j++) {
                    String tmp = String.valueOf(i) + String.valueOf(j);
                    polaPlanszy.add(new Pole(Integer.parseInt(tmp), 0));
                }
                polaPlanszy.add(new Pole(Integer.parseInt(String.valueOf(i + 1) + String.valueOf(0)), 0));
            }
            i++;
            button.setName(String.valueOf(i));
            button.addActionListener(this);
            //System.out.println("id: " + polaPlanszy.get(i-1).getId() + " x: " + polaPlanszy.get(i-1).getWsp_x()+ " y: " + polaPlanszy.get(i-1).getWsp_y());
        }
        planszaGracza = new Plansza(polaPlanszy);


        ustawStatkiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(hp < 17){
                    komunikatLabel.setText("Ustaw statek 2 - polowy");
                }
                else{
                    komunikatLabel.setText("Wykonaj strzał");
                }
            }
        });
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    private Boolean poprawnoscPola(Statek statek, Pole pole){
        if(planszaGracza.getListaPol().get(pole.getId() - 1).getStan() != 0) return false;
        if(statek.getListaPol().size() == 1){
            Pole pierwsze = statek.getListaPol().get(0);
            if(pole.getWsp_x() == pierwsze.getWsp_x()){
                statek.setKierunek(pole.getWsp_x());
                return pierwsze.getWsp_y() + 1 == pole.getWsp_y() || pierwsze.getWsp_y() - 1 == pole.getWsp_y();
            }
            else if(pole.getWsp_y() == pierwsze.getWsp_y()){
                statek.setKierunek(pole.getWsp_y());
                return pierwsze.getWsp_x() + 1 == pole.getWsp_x() || pierwsze.getWsp_x() - 1 == pole.getWsp_x();
            }
            else return false;
        }
        else{
            int kierunek = statek.getKierunek();
            int rozmiar = statek.getListaPol().size();
            int[] tab = new int[rozmiar];
            int min, max;
            if(kierunek == pole.getWsp_x()){
                for(int i = 0; i < rozmiar; i++){
                    tab[i] = statek.getListaPol().get(i).getWsp_y();
                }
                Arrays.sort(tab);
                min = tab[0];
                max = tab[rozmiar - 1];
                return min - 1 == pole.getWsp_y() || max + 1 == pole.getWsp_y();
            }
            else if(kierunek == pole.getWsp_y()){
                for(int i = 0; i < rozmiar; i++){
                    tab[i] = statek.getListaPol().get(i).getWsp_x();
                }
                Arrays.sort(tab);
                min = tab[0];
                max = tab[rozmiar - 1];
                return min - 1 == pole.getWsp_x() || max + 1 == pole.getWsp_x();
            }
            else return false;
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton pom;
        Pole pole;
        pom = (JButton) e.getSource();
        int id = Integer.parseInt(pom.getName());
        pole = planszaGracza.getListaPol().get(id - 1);
        if(hp < 3){
            if(statek2.getListaPol().size() > 0) {
                if(poprawnoscPola(statek2, pole)){
                    pole.setStan(statek2.getId());
                    statek2.dodajPole(pole);
                    pom.setBackground(Color.GREEN);
                    hp++;
                }
                else JOptionPane.showMessageDialog(mainPanel, "Błędne ustawienie");
            }
            else {
                pole.setStan(statek2.getId());
                statek2.dodajPole(pole);
                pom.setBackground(Color.GREEN);
                hp++;
            }

            if (hp == 3) komunikatLabel.setText("Ustaw pierwszy statek 3 - polowy");
        }
        else if(hp < 6){
            if(statek3_1.getListaPol().size() > 0) {
                if(poprawnoscPola(statek3_1, pole)){
                    pole.setStan(statek3_1.getId());
                    statek3_1.dodajPole(pole);
                    pom.setBackground(Color.GREEN);
                    hp++;
                }
                else JOptionPane.showMessageDialog(mainPanel, "Błędne ustawienie");
            }
            else {
                if(planszaGracza.getListaPol().get(pole.getId() - 1).getStan() != 0) JOptionPane.showMessageDialog(mainPanel, "Błędne ustawienie");
                else {
                    pole.setStan(statek3_1.getId());
                    statek3_1.dodajPole(pole);
                    pom.setBackground(Color.GREEN);
                    hp++;
                }
            }

            if (hp == 6) komunikatLabel.setText("Ustaw drugi statek 3 - polowy");
        }
        else if(hp < 9){
            if(statek3_2.getListaPol().size() > 0) {
                if(poprawnoscPola(statek3_2, pole)){
                    pole.setStan(statek3_2.getId());
                    statek3_2.dodajPole(pole);
                    pom.setBackground(Color.GREEN);
                    hp++;
                }
                else JOptionPane.showMessageDialog(mainPanel, "Błędne ustawienie");
            }
            else {
                if(planszaGracza.getListaPol().get(pole.getId() - 1).getStan() != 0) JOptionPane.showMessageDialog(mainPanel, "Błędne ustawienie");
                else {
                    pole.setStan(statek3_2.getId());
                    statek3_2.dodajPole(pole);
                    pom.setBackground(Color.GREEN);
                    hp++;
                }
            }
            if (hp == 9) komunikatLabel.setText("Ustaw statek 4 - polowy");
        }
        else if(hp < 13){
            if(statek4.getListaPol().size() > 0) {
                if(poprawnoscPola(statek4, pole)){
                    pole.setStan(statek4.getId());
                    statek4.dodajPole(pole);
                    pom.setBackground(Color.GREEN);
                    hp++;
                }
                else JOptionPane.showMessageDialog(mainPanel, "Błędne ustawienie");
            }
            else {
                if(planszaGracza.getListaPol().get(pole.getId() - 1).getStan() != 0) JOptionPane.showMessageDialog(mainPanel, "Błędne ustawienie");
                else {
                    pole.setStan(statek4.getId());
                    statek4.dodajPole(pole);
                    pom.setBackground(Color.GREEN);
                    hp++;
                }
            }
            if(hp == 13) komunikatLabel.setText("Ustaw statek 5 - polowy");
        }
        else if (hp < 18){
            if(statek5.getListaPol().size() > 0) {
                if(poprawnoscPola(statek5, pole)){
                    pole.setStan(statek5.getId());
                    statek5.dodajPole(pole);
                    pom.setBackground(Color.GREEN);
                    hp++;
                }
                else JOptionPane.showMessageDialog(mainPanel, "Błędne ustawienie");

            }
            else {
                if(planszaGracza.getListaPol().get(pole.getId() - 1).getStan() != 0) JOptionPane.showMessageDialog(mainPanel, "Błędne ustawienie");
                else {
                    pole.setStan(statek5.getId());
                    statek5.dodajPole(pole);
                    pom.setBackground(Color.GREEN);
                    hp++;
                }
            }
            if(hp == 18) komunikatLabel.setText("Zatwierdź ustawienia statków");
        }
        else {
            System.out.println(id);
            System.out.println("Stan pola: " + planszaGracza.getListaPol().get(id - 1).getStan() + " x: " + planszaGracza.getListaPol().get(id - 1).getWsp_x() + " y: " + planszaGracza.getListaPol().get(id - 1).getWsp_y());
            klient.wykonajStrzal(id);
        }

    }

}
