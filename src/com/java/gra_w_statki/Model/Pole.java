package com.java.gra_w_statki.Model;

public class Pole {
    private Integer id;
    private Integer wsp_x;
    private Integer wsp_y;
    private Integer stan;

    public Pole() {
        this.id = 0;
        this.stan = 0;
    }

    public Pole(Integer id, Integer stan) {
        this.id = id;
        this.stan = stan;
//        if(id > 0 && id <10) {
//            setWsp_x(0);
//            setWsp_y((int) id.toString().charAt(0) - 1);
//        }
//        else{
//            setWsp_x((int) id.toString().charAt(0));
//           setWsp_y((int) id.toString().charAt(1) - 1);
//        }

    }

    public Integer getId() {
        return id;
    }

    public Integer getWsp_x() {
        return wsp_x;
    }

    public Integer getWsp_y() {
        return wsp_y;
    }

    public Integer getStan() {
        return stan;
    }

    private void setWsp_x(Integer wsp_x) {
        this.wsp_x = wsp_x;
    }

    private void setWsp_y(Integer wsp_y) {
        this.wsp_y = wsp_y;
    }
}
