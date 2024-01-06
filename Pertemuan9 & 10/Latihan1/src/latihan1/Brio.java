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
public class Brio extends Mobil {
    
    public Brio() {
        super.setNama("Brio");
        super.setTahunProduksi("2020");
        super.setWarna("Hitam");
    }

    @Override
    public void tampilSpesifikasi() {
        System.out.println("Jenis Mobil    : "+super.getNama());
        System.out.println("Tahun Produksi : "+super.getTahunProduksi());
        System.out.println("Warna Mobil    : "+super.getWarna());
    }

    @Override
    public void start() {
        System.out.println("Mobil Dinyalakan Dengan Menekan Tombol Start Engine"); 
    }

    @Override
    public void akselarasi() {
        System.out.println("Mobil melaju dengan kecepatan 20 KM/Jam"); 
    }
    
}
