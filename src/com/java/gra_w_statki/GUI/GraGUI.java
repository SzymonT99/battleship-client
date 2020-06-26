package com.java.gra_w_statki.GUI;

import com.java.gra_w_statki.Kontrolery.HttpClientGET;
import com.java.gra_w_statki.Kontrolery.HttpClientPOST;
import com.java.gra_w_statki.Model.Plansza;
import com.java.gra_w_statki.Model.Pole;
import com.java.gra_w_statki.Model.Statek;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class GraGUI extends JFrame implements ActionListener {
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
    private JButton[] tabPrzyciskow = {b01, b02, b03, b04, b05, b06, b07, b08, b09, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36, b37,
            b38, b39, b40, b41, b42, b43, b44, b45, b46, b47, b48, b49, b50, b51, b52, b53, b54, b55, b56, b57, b58, b59, b60, b61, b62, b63, b64, b65, b66, b67, b68, b69, b70, b71, b72, b73, b74, b75,
            b76, b77, b78, b79, b80, b81, b82, b83, b84, b85, b86, b87, b88, b89, b90, b91, b92, b93, b94, b95, b96, b97, b98, b99, b100};
    private JButton ustawStatkiButton;
    private JButton wyjdzZGryButton;
    private JButton przerwijGreButton;
    private JPanel mainPanel;
    private JLabel komunikatLabel;
    private JButton cofnijStatekButton;
    private JLabel turaGryLabel;

    private HttpClientGET klientGET = new HttpClientGET();
    private HttpClientPOST klientPOST = new HttpClientPOST();
    private Plansza planszaGracza;
    private Plansza planszaPrzeciwnika;
    private Statek statek2 = new Statek(1, 2);
    private Statek statek2p = new Statek(1, 2);
    private Statek statek3_1 = new Statek(2, 3);
    private Statek statek3_1p = new Statek(2, 3);
    private Statek statek3_2 = new Statek(3, 3);
    private Statek statek3_2p = new Statek(3, 3);
    private Statek statek4 = new Statek(4, 4);
    private Statek statek4p = new Statek(4, 4);
    private Statek statek5 = new Statek(5, 5);
    private Statek statek5p = new Statek(5, 5);
    private Integer hp = 0;
    private Integer runda = 0;          // runda = 0 gdy jest kolejka gracza a gdy runda = 1 to jest kolejka przeciwnika
    private Integer startOdliczania = 0;


    public GraGUI() {
        add(mainPanel);
        setTitle("Gra w statki");
        setBounds(540, 150, 920, 730);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ArrayList<Pole> polaPlanszyGracza = new ArrayList<>();
        ArrayList<Pole> polaPlanszyPrzeciwnika = new ArrayList<>();
        int i = 0;
        for (JButton button : tabPrzyciskow) {
            if (i < 10) {
                for (int j = 1; j < 10; j++) {
                    String tmp = String.valueOf(i) + String.valueOf(j);
                    polaPlanszyGracza.add(new Pole(Integer.parseInt(tmp), 0));
                    polaPlanszyPrzeciwnika.add(new Pole(Integer.parseInt(tmp), 0));

                }
                polaPlanszyGracza.add(new Pole(Integer.parseInt(String.valueOf(i + 1) + String.valueOf(0)), 0));
                polaPlanszyPrzeciwnika.add(new Pole(Integer.parseInt(String.valueOf(i + 1) + String.valueOf(0)), 0));
            }
            i++;
            button.setName(String.valueOf(i));
            button.addActionListener(this);
            //System.out.println("id: " + polaPlanszy.get(i-1).getId() + " x: " + polaPlanszy.get(i-1).getWsp_x()+ " y: " + polaPlanszy.get(i-1).getWsp_y());
        }
        planszaGracza = new Plansza(polaPlanszyGracza);
        planszaPrzeciwnika = new Plansza(polaPlanszyPrzeciwnika);
        planszaPrzeciwnika.getListaStatkow().add(statek2p);
        planszaPrzeciwnika.getListaStatkow().add(statek3_1p);
        planszaPrzeciwnika.getListaStatkow().add(statek3_2p);
        planszaPrzeciwnika.getListaStatkow().add(statek4p);
        planszaPrzeciwnika.getListaStatkow().add(statek5p);


        ustawStatkiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hp == 0) {
                    komunikatLabel.setText("Ustaw statek 2 - polowy");
                } else if (hp < 17) {
                    JOptionPane.showMessageDialog(mainPanel, "Nie ustawiono wszystkich statków");
                } else {
                    hp = 18;        // hp = 18 gdy statki zostały już ustawione
                    ustawPlansze(planszaPrzeciwnika, 1);
                    komunikatLabel.setText("Wykonaj strzał");
                    turaGryLabel.setText("Tura ataku - do ataku!");
                }
            }
        });
        cofnijStatekButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Statek statek = new Statek();
                if (hp <= 2) statek = statek2;
                else if (hp <= 5) statek = statek3_1;
                else if (hp <= 8) statek = statek3_2;
                else if (hp <= 12) statek = statek4;
                else if (hp <= 17) statek = statek5;
                else JOptionPane.showMessageDialog(mainPanel, "Statki zostały już ustawione");

                int rozmiar = statek.getListaPol().size();
                if (rozmiar != 0) {
                    for (Pole pole : statek.getListaPol()) {
                        planszaGracza.getListaPol().get(pole.getId() - 1).setStan(0);
                    }
                    hp = hp - rozmiar;
                    statek.getListaPol().clear();
                    ustawPlansze(planszaGracza, 0);
                    if (hp == 0) komunikatLabel.setText("Ustaw statek 2 - polowy");
                    else if (hp == 2) komunikatLabel.setText("Ustaw pierwszy statek 3 - polowy");
                    else if (hp == 5) komunikatLabel.setText("Ustaw drugi statek 3 - polowy");
                    else if (hp == 8) komunikatLabel.setText("Ustaw statek 4 - polowy");
                    else if (hp == 12) komunikatLabel.setText("Ustaw statek 5 - polowy");
                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    private Boolean poprawnoscPola(Statek statek, Pole pole) {
        if (planszaGracza.getListaPol().get(pole.getId() - 1).getStan() != 0) return false;
        if (statek.getListaPol().size() == 0) {
            return true;
        } else if (statek.getListaPol().size() == 1) {
            Pole pierwsze = statek.getListaPol().get(0);
            if (pole.getWsp_x() == pierwsze.getWsp_x()) {
                statek.setKierunek('x');
                return pierwsze.getWsp_y() + 1 == pole.getWsp_y() || pierwsze.getWsp_y() - 1 == pole.getWsp_y();
            } else if (pole.getWsp_y() == pierwsze.getWsp_y()) {
                statek.setKierunek('y');
                return pierwsze.getWsp_x() + 1 == pole.getWsp_x() || pierwsze.getWsp_x() - 1 == pole.getWsp_x();
            } else return false;

        } else {
            char kierunek = statek.getKierunek();
            int rozmiar = statek.getListaPol().size();
            int[] tab = new int[rozmiar];
            int min, max;
            if (kierunek == 'x') {
                int warKierunku = statek.getListaPol().get(0).getWsp_x();
                for (int i = 0; i < rozmiar; i++) {
                    tab[i] = statek.getListaPol().get(i).getWsp_y();
                }
                Arrays.sort(tab);
                min = tab[0];
                max = tab[rozmiar - 1];
                return (pole.getWsp_x() == warKierunku && min - 1 == pole.getWsp_y()) || (pole.getWsp_x() == warKierunku && max + 1 == pole.getWsp_y());
            } else if (kierunek == 'y') {
                int warKierunku = statek.getListaPol().get(0).getWsp_y();
                for (int i = 0; i < rozmiar; i++) {
                    tab[i] = statek.getListaPol().get(i).getWsp_x();
                }
                Arrays.sort(tab);
                min = tab[0];
                max = tab[rozmiar - 1];
                return (pole.getWsp_y() == warKierunku && min - 1 == pole.getWsp_x()) || (pole.getWsp_y() == warKierunku && max + 1 == pole.getWsp_x());
            } else return false;
        }
    }

    private void badajStrzal(Pole ustrzelonePole, Plansza plansza) {
        Integer stanPola = ustrzelonePole.getStan();
        Integer idPola = ustrzelonePole.getId();
        if (stanPola > 5) komunikatLabel.setText("Na to pole już został oddany strzał - zmarnowana kolejka");
        else if (stanPola == 0) {
            komunikatLabel.setText("Pudło!");
            plansza.getListaPol().get(idPola - 1).setStan(11);
        } else {
            Statek trafionyStatek;
            if (stanPola == 1) trafionyStatek = plansza.getListaStatkow().get(0);
            else if (stanPola == 2) trafionyStatek = plansza.getListaStatkow().get(1);
            else if (stanPola == 3) trafionyStatek = plansza.getListaStatkow().get(2);
            else if (stanPola == 4) trafionyStatek = plansza.getListaStatkow().get(3);
            else trafionyStatek = plansza.getListaStatkow().get(4);

            Integer wyznacznikZatopienia = 0;
            if (trafionyStatek.getListaPol().size() == trafionyStatek.getDlugosc() - 1) {
                for (int i = 0; i < trafionyStatek.getDlugosc() - 1; i++) {
                    wyznacznikZatopienia += trafionyStatek.getListaPol().get(i).getStan();
                }
                wyznacznikZatopienia /= trafionyStatek.getDlugosc() - 1;
            }

            if (wyznacznikZatopienia == 99) {
                komunikatLabel.setText("Trafiony zatopiony!");
                for (int i = 0; i < trafionyStatek.getDlugosc() - 1; i++) {
                    plansza.getListaPol().get(trafionyStatek.getListaPol().get(i).getId() - 1).setStan(999);
                }
                plansza.getListaPol().get(idPola - 1).setStan(999);
                trafionyStatek.zatopienie();        //zatopienie statku - wyczyszenie listy Pol statku
            } else {
                komunikatLabel.setText("Trafiony!");
                if (plansza == planszaGracza) {
                    trafionyStatek.trafienie(idPola);
                    plansza.getListaPol().get(idPola - 1).setStan(99);
                } else {                           // w przypadku planszy przeciwnika po każdym celnym strzale - takie pole jest do statku dodawane
                    ustrzelonePole.setStan(99);
                    trafionyStatek.dodajPole(ustrzelonePole);
                    plansza.getListaPol().get(idPola - 1).setStan(99);
                }
            }
        }
    }

    private void blokowaniePol(Boolean tryb) {
        for (JButton button : tabPrzyciskow) {
            button.setEnabled(tryb);
        }
    }

    private void ustawPlansze(Plansza plansza, Integer rola) {   // rola = 0 gdy plansza gracza
        Pole pole;                                               // rola = 1 gdy plansza przeciwnika
        JButton button;
        int i;
        for (i = 0; i < tabPrzyciskow.length; i++) {
            pole = plansza.getListaPol().get(i);
            button = tabPrzyciskow[i];
            if (pole.getStan() == 0) {
                button.setBackground(new java.awt.Color(21, 122, 227));
            } else if (pole.getStan() >= 1 && pole.getStan() <= 5) {
                if (rola == 0) button.setBackground(Color.GREEN);
                else button.setBackground(Color.RED);
            } else if (pole.getStan() == 11) {                     // stan = 11 gdy na pole padł niecelny strzał(pudło)
                button.setBackground(Color.GRAY);
            } else if (pole.getStan() == 99) {                      // stan = 99 gdy trafiono w statek
                button.setBackground(Color.ORANGE);
            } else {                                                // stan = 999 gdy statek zatopiony
                button.setBackground(Color.BLACK);
            }
        }
    }

    private Boolean sprawdzStatki(Plansza plansza) {
        int i = 0;
        for (Statek statek : plansza.getListaStatkow()) {
            if (statek.getListaPol() == null) {
                i++;
            }
        }
        if (i == 5) return false;
        else return true;
    }

    private void turaPrzeciwnika() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                startOdliczania++;
                System.out.println(startOdliczania);
                okreslRuchy();
                if (startOdliczania == 14) {
                    timer.cancel();
                    startOdliczania = 0;
                }
            }
        }, 1000, 1000);
    }

    private void okreslRuchy() {
        if (startOdliczania == 5) {
            komunikatLabel.setText("...");
            turaGryLabel.setText("Tura obrony - przeciwnik atakuje");
            ustawPlansze(planszaGracza, 0);
        } else if (startOdliczania == 9) {
            Integer idAtakowanegoPola = klientGET.otrzymajStrzal();
            Pole atakowanePole = planszaGracza.getListaPol().get(idAtakowanegoPola - 1);
            klientPOST.odpowiedzNaStrzal(atakowanePole);
            badajStrzal(atakowanePole, planszaGracza);
            ustawPlansze(planszaGracza, 0);
            if (!sprawdzStatki(planszaGracza)) komunikatLabel.setText("NIESTETY PRZECIWNIK WYGRAŁ");
        } else if (startOdliczania == 14) {
            blokowaniePol(true);
            ustawPlansze(planszaPrzeciwnika, 1);
            turaGryLabel.setText("Tura ataku - do ataku!");
            komunikatLabel.setText("Wykonaj strzał");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton pom;
        Pole pole;
        pom = (JButton) e.getSource();
        int id = Integer.parseInt(pom.getName());
        pole = planszaGracza.getListaPol().get(id - 1);
        if (hp < 2) {
            if (poprawnoscPola(statek2, pole)) {
                pole.setStan(statek2.getId());
                statek2.dodajPole(pole);
                pom.setBackground(Color.GREEN);
                hp++;
            } else JOptionPane.showMessageDialog(mainPanel, "Błędne ustawienie");

            if (hp == 2) komunikatLabel.setText("Ustaw pierwszy statek 3 - polowy");
        } else if (hp < 5) {
            if (poprawnoscPola(statek3_1, pole)) {
                pole.setStan(statek3_1.getId());
                statek3_1.dodajPole(pole);
                pom.setBackground(Color.GREEN);
                hp++;
            } else JOptionPane.showMessageDialog(mainPanel, "Błędne ustawienie");

            if (hp == 5) komunikatLabel.setText("Ustaw drugi statek 3 - polowy");
        } else if (hp < 8) {
            if (poprawnoscPola(statek3_2, pole)) {
                pole.setStan(statek3_2.getId());
                statek3_2.dodajPole(pole);
                pom.setBackground(Color.GREEN);
                hp++;
            } else JOptionPane.showMessageDialog(mainPanel, "Błędne ustawienie");

            if (hp == 8) komunikatLabel.setText("Ustaw statek 4 - polowy");
        } else if (hp < 12) {
            if (poprawnoscPola(statek4, pole)) {
                pole.setStan(statek4.getId());
                statek4.dodajPole(pole);
                pom.setBackground(Color.GREEN);
                hp++;
            } else JOptionPane.showMessageDialog(mainPanel, "Błędne ustawienie");

            if (hp == 12) komunikatLabel.setText("Ustaw statek 5 - polowy");
        } else if (hp < 17) {
            if (poprawnoscPola(statek5, pole)) {
                pole.setStan(statek5.getId());
                statek5.dodajPole(pole);
                pom.setBackground(Color.GREEN);
                hp++;
            } else JOptionPane.showMessageDialog(mainPanel, "Błędne ustawienie");
            if (hp == 17) {
                planszaGracza.getListaStatkow().add(statek2);
                planszaGracza.getListaStatkow().add(statek3_1);
                planszaGracza.getListaStatkow().add(statek3_2);
                planszaGracza.getListaStatkow().add(statek4);
                planszaGracza.getListaStatkow().add(statek5);
                komunikatLabel.setText("Zatwierdź ustawienia statków");
            }

        } else {
            Pole polePrzeciwnika = klientGET.wykonajStrzal(id);
            badajStrzal(polePrzeciwnika, planszaPrzeciwnika);
            ustawPlansze(planszaPrzeciwnika, 1);
            blokowaniePol(false);
            if (!sprawdzStatki(planszaPrzeciwnika)) komunikatLabel.setText("GRATULACJE WYGRANO GRE");
            turaPrzeciwnika();
        }

    }

}
