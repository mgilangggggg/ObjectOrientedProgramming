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
public class Bola extends BangunDatar {
    public Bola() {
        super.setJarijari(10); 
    }
    
    @Override
    public void tampilHasil() {
        System.out.println("TAMPIL VOLUME BOLA");
        System.out.println("Jari-jari Bola   = "+super.getJarijari());
        
        double volumeBola = 4 * PHI * super.getJarijari() * super.getJarijari() * super.getJarijari() / 3;
        
        System.out.println("VOLUME BOLA      = "+volumeBola);
        System.out.println("");
    }
}
