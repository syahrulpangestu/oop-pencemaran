package com.quizpbo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.print("masukan jumlah kota : ");
	    int input_jml_kota = scanner.nextInt();
        int[] limbah = new int[input_jml_kota];
        int[] polusi_air = new int[input_jml_kota];
        int[] polusi_udara = new int[input_jml_kota];
        String[] nama_kota = new String[input_jml_kota];
        CekKondisi[] data = new CekKondisi[input_jml_kota];
	    for (int i = 0; i< input_jml_kota;i++){
            System.out.print("\n");
            System.out.print("masukan nama kota : ");
            nama_kota[i] = scanner.next();
            System.out.print("masukan limbah kota : ");
            limbah[i] = scanner.nextInt();
            System.out.print("masukan polusi air : ");
            polusi_air[i] = scanner.nextInt();
            System.out.print("masukan polusi udara : ");
            polusi_udara[i] = scanner.nextInt();
            data[i] = new CekKondisi(limbah[i], polusi_air[i], polusi_udara[i], nama_kota[i]);

        }
        System.out.println("\nNama kota\t" + "Limbah(40%)\t" + "Polusi Air(30%)\t"+ "Polusi Udara(30%)\t" + "Final skor\t" + "Tercemar?");
	    for (int i = 0;i<input_jml_kota;i++){
            data[i].tampil();
        }
    }
}
