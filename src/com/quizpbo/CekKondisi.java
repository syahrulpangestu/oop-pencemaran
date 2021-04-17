package com.quizpbo;

public class CekKondisi extends Hitung {

    public CekKondisi(int limbah, int polusi_air, int polusi_udara, String nama_kota){
        super(limbah,polusi_air,polusi_udara,nama_kota);
    }

    public String kondisi(){
        if (super.total()<=50){
            return "Tidak";
        }else {
            return "Ya";
        }
    }
    public void tampil(){
        System.out.println(getNama_kota()+"\t\t\t"+getLimbah()+"\t\t\t"+getPolusi_air()+"\t\t\t\t"+getPolusi_udara()+"\t\t\t\t"+total()+"\t\t\t\t"+kondisi()+"\t\t\t");
    }
}
