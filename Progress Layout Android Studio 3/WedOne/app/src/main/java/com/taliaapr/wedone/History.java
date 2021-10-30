package com.taliaapr.wedone;

public class History {
    private String namaTokoHistory;
    private String alamatTokoHistory;
    private String bajuSewaHistory;
    private String hargaSewaHistory;

    public History(String namaTokoHistory, String alamatTokoHistory, String bajuSewaHistory, String hargaSewaHistory) {
        this.namaTokoHistory = namaTokoHistory;
        this.alamatTokoHistory = alamatTokoHistory;
        this.bajuSewaHistory = bajuSewaHistory;
        this.hargaSewaHistory = hargaSewaHistory;
    }

    public String getNamaTokoHistory() {
        return namaTokoHistory;
    }

    public void setNamaTokoHistory(String namaTokoHistory) {
        this.namaTokoHistory = namaTokoHistory;
    }

    public String getAlamatTokoHistory() {
        return alamatTokoHistory;
    }

    public void setAlamatTokoHistory(String alamatTokoHistory) {
        this.alamatTokoHistory = alamatTokoHistory;
    }

    public String getBajuSewaHistory() {
        return bajuSewaHistory;
    }

    public void setBajuSewaHistory(String bajuSewaHistory) {
        this.bajuSewaHistory = bajuSewaHistory;
    }

    public String getHargaSewaHistory() {
        return hargaSewaHistory;
    }

    public void setHargaSewaHistory(String hargaSewaHistory) {
        this.hargaSewaHistory = hargaSewaHistory;
    }

}
