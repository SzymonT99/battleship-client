package com.java.gra_w_statki.Model;

import java.util.ArrayList;

public class Plansza {
    private Boolean turaWalki;
    private Integer liczbaStrzalow;
    private ArrayList<Pole> listaPol;

    public Plansza(ArrayList<Pole> listaPol) {
        this.listaPol = listaPol;
    }

    public Boolean getTuraWalki() {
        return turaWalki;
    }

    public Integer getLiczbaStrzalow() {
        return liczbaStrzalow;
    }

    public ArrayList<Pole> getListaPol() {
        return listaPol;
    }

    public void setTuraWalki(Boolean turaWalki) {
        this.turaWalki = turaWalki;
    }

    public void setLiczbaStrzalow(Integer liczbaStrzalow) {
        this.liczbaStrzalow = liczbaStrzalow;
    }


}
