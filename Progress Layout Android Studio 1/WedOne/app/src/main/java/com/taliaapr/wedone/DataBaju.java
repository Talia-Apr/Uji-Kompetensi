package com.taliaapr.wedone;

public class DataBaju {
    private String namaBaju;
    private String hargaSewa;
    private Integer imgBaju;

    public DataBaju(String namaBaju, String hargaSewa, Integer imgBaju) {
        this.namaBaju = namaBaju;
        this.hargaSewa = hargaSewa;
        this.imgBaju = imgBaju;
    }

    public String getNamaBaju() {
        return namaBaju;
    }

    public void setNamaBaju(String namaBaju) {
        this.namaBaju = namaBaju;
    }

    public String getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(String hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public Integer getImgBaju() {
        return imgBaju;
    }

    public void setImgBaju(Integer imgBaju) {
        this.imgBaju = imgBaju;
    }
}
