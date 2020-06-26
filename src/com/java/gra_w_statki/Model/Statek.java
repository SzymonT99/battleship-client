package com.java.gra_w_statki.Model;

import java.util.ArrayList;

public class Statek {
    private Integer id;
    private Integer dlugosc;
    private char kierunek;
    private ArrayList<Pole> listaPol = new ArrayList<>();

    public Statek() {
    }

    public Statek(Integer id, Integer dlugosc) {
        this.id = id;
        this.dlugosc = dlugosc;
    }

    public Integer getId() {
        return id;
    }

    public Integer getDlugosc() {
        return dlugosc;
    }

    public void dodajPole(Pole pole){
        listaPol.add(pole);
    }

    public ArrayList<Pole> getListaPol() {
        return listaPol;
    }

    public char getKierunek() {
        return kierunek;
    }

    public void setKierunek(char kierunek) {
        this.kierunek = kierunek;
    }

    public void trafienie(Integer idPolaTrafionego) {
        int id;
        for (int i = 0; i < getDlugosc(); i++){
            id = listaPol.get(i).getId();
            if (id == idPolaTrafionego){
                listaPol.get(i).setStan(99);
                System.out.println("Z klasy statek " + listaPol.get(i).getStan());
            }
        }
    }

    public void zatopienie(){
        listaPol.clear();
        listaPol = null;
    }
}

