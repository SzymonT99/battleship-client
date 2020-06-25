package com.java.gra_w_statki.Model;

import java.util.ArrayList;

public class Gracz {
    private Integer id;
    private String login;
    private String haslo;
    private Integer liczbaGier;
    private ArrayList<Statek> listaStatkow = new java.util.ArrayList<>();

    public Gracz(Integer id, String login, String haslo) {
        this.id = id;
        this.login = login;
        this.haslo = haslo;
    }

    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getHaslo() {
        return haslo;
    }

    public Integer getLiczbaGier() {
        return liczbaGier;
    }

    public ArrayList<Statek> getListaStatkow() {
        return listaStatkow;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public void setLiczbaGier(Integer liczbaGier) {
        this.liczbaGier = liczbaGier;
    }

    public void setListaStatkow(ArrayList<Statek> listaStatkow) {
        this.listaStatkow = listaStatkow;
    }
}
