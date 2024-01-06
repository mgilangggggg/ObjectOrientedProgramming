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
public class Jazz implements Mobil {
    
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
    
    public Jazz() {
        this.setNama("Jazz");
        this.setTahunProduksi("2021");
        this.setWarna("Kuning");
    }

    @Override
    public void tampilSpesifikasi() {
        System.out.println("Jenis Mobil    : " +this.getNama());
        System.out.println("Tahun Produksi : " +this.getTahunProduksi());
        System.out.println("Warna          : " +this.getWarna());
    }

    @Override
    public void start() {
        System.out.println("Mobil Dinyalakan Dengan Menggunakan e-Ktp");
    }

    @Override
    public void akselarasi() {
        System.out.println("Mobil Melaju Dengan Kecepatan 30 KM/Jam");
    }
    
}
