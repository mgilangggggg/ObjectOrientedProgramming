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
public class Avanza extends Mobil {
    
    public Avanza(){
        super.setNama("Avanza");
        super.setTahunProduksi("2018");
        super.setWarna("Putih");
    }

    @Override
    public void tampilSpesifikasi() {
        System.out.println("Jenis Mobil    : "+super.getNama());
        System.out.println("Tahun Produksi : "+super.getTahunProduksi());
        System.out.println("Warna Mobil    : "+super.getWarna());
    }

    @Override
    public void start() {
        System.out.println("Mobil Dinyalakan Dengan Menggunakan Kunci Mobil");
    }

    @Override
    public void akselarasi() {
        System.out.println("Mobil Melaju Dengan Kecepatan 10 KM/Jam"); 
    }
    
}
