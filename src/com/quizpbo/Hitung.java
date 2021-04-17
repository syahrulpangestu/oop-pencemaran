package com.quizpbo;

public class Hitung {
    private int limbah;
    private int polusi_air;
    private int polusi_udara;
    private String nama_kota;

    public Hitung(int limbah, int polusi_air, int polusi_udara, String nama_kota){
        this.limbah = limbah;
        this.polusi_air = polusi_air;
        this.polusi_udara = polusi_udara;
        this.nama_kota = nama_kota;
    }

    public Hitung(){
        this.limbah = 0;
        this.polusi_air = 0;
        this.polusi_udara = 0;
    }

    public int getLimbah() {
        return limbah;
    }

    public int getPolusi_udara() {
        return polusi_udara;
    }

    public int getPolusi_air() {
        return polusi_air;
    }


    public String getNama_kota() {
        return nama_kota;
    }

    public int limbah(){
        return (int)(getLimbah()*0.4);
    }

    public int polusi_air(){
        return (int)(getPolusi_air()*0.3);
    }

    public int polusi_udara(){
        return (int)(getPolusi_udara()*0.3);
    }


    public int total(){
        return limbah()+polusi_air()+polusi_udara();
    }
}
