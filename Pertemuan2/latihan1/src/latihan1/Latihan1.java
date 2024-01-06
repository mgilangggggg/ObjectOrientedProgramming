/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author Gilang
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Program Menampilkan Hasil Perhitungan Luas dan keliling Suatu Bangun Datar
        double kelilingPersegi, luasPersegi, kelilingPersegipjg, luasPersegipjg, kelilingLingkaran, luasLingkaran;
        double keliling, sisi, panjang, lebar, jari_jari;
        
        // Menghitung Luas dan Keliling Persegi
        keliling = 4;
        sisi = 10;
        kelilingPersegi = keliling * sisi;
        luasPersegi = sisi * sisi;
        
        // Menghitung Keliling dan Luas Persegi Panjang
        panjang = 5; 
        lebar = 10;
        kelilingPersegipjg = 2 * panjang + 2 * lebar;
        luasPersegipjg = panjang * lebar;
        
        // Menghitung Keliling dan Luas Lingkaran
        jari_jari = 7;
        kelilingLingkaran = 2 * 3.14 * jari_jari;
        luasLingkaran = 3.14 * jari_jari * jari_jari;
        
        // Menampilkan Hasil Perhitungan
        System.out.println("Menghitung Keliling dan Luas Persegi");
        System.out.println("============================================\n");
        System.out.println("Keliling Persegi \t = " +kelilingPersegi);
        System.out.println("Luas Persegi \t\t = " +luasPersegi+ "\n");
        System.out.println("Menghitung Keliling dan Luas Persegi Panjang");
        System.out.println("============================================\n");
        System.out.println("keliling Persegi Panjang = " +kelilingPersegipjg);
        System.out.println("Luas Persegi Panjang \t = " +luasPersegipjg+ "\n");
        System.out.println("Menghitung Keliling dan Luas Lingkaran");
        System.out.println("============================================\n");
        System.out.println("Keliling Lingkaran \t = " +kelilingLingkaran);
        System.out.println("Luas Lingkaran \t\t = " +luasLingkaran);
    }
    
}
