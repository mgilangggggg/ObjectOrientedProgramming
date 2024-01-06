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
public class Tabung extends BangunDatar {
    public Tabung() {
        super.setJarijari(10);
        super.setTinggi(8);
    }
    
    @Override
    public void tampilHasil() {
        System.out.println("TAMPIL VOLUME TABUNG");
        System.out.println("Jari-jari Tabung = "+super.getJarijari());
        System.out.println("Tinggi Tabung    = "+super.getTinggi());
        
       double volumeTabung = PHI * super.getJarijari() * super.getJarijari() * super.getTinggi();
        
        System.out.println("VOLUME TABUNG    = "+volumeTabung);
        System.out.println("");
    }
}
