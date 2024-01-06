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
public class Balok extends BangunDatar {
    
    public Balok() {
        super.setPanjang(10);
        super.setLebar(5);
    }
    
    @Override
    public void tampilHasil() {
        System.out.println("TAMPIL VOLUME BALOK");
        System.out.println("Panjang          = "+super.getPanjang());
        System.out.println("Lebar            = "+super.getLebar());
        
        double volumeBalok = super.getPanjang() * super.getLebar();
        
        System.out.println("VOLUME BALOK     = "+volumeBalok);
        System.out.println("");
    }
}
