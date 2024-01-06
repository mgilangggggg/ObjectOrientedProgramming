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
public abstract class Mobil {
    private String nama;
    private String tahunProkduksi;
    private String warna;
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTahunProduksi() {
        return tahunProkduksi;
    }

    public void setTahunProduksi(String tahunProkduksi) {
        this.tahunProkduksi = tahunProkduksi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    } 
    
    public abstract void tampilSpesifikasi();
    public abstract void start();
    public abstract void akselarasi();
}
