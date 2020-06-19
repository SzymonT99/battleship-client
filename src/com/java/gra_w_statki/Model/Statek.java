package com.java.gra_w_statki.Model;

import java.util.ArrayList;

public class Statek {
    private Integer id;
    private Integer hp;
    private ArrayList<Pole> listaPol;

    public Statek(Integer id, Integer hp) {
        this.id = id;
        this.hp = hp;
    }

    public Integer getId() {
        return id;
    }

    public Integer getHp() {
        return hp;
    }

    public void dodajPole(Pole pole){
        listaPol.add(pole);
    }

    public ArrayList<Pole> getListaPol() {
        return listaPol;
    }
}
