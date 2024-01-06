/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author Gilang
 */
public class Avanza implements Mobil {
    
    private String nama;
    private String tahunProduksi;
    private String Warna;

    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(String tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }
    
    public Avanza() {
        this.setNama("Avanza");
        this.setTahunProduksi("2018");
        this.setWarna("Putih");
    }

    @Override
    public void tampilSpesifikasi() {
        System.out.println("Jenis Mobil    : " +this.getNama());
        System.out.println("Tahun Produksi : " +this.getTahunProduksi());
        System.out.println("Warna Mobil    : " +this.getWarna());
        
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
