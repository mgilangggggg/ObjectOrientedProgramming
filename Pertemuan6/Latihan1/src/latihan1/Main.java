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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BangunDatar Balok = new Balok();
        BangunDatar Tabung = new Tabung();
        BangunDatar Bola = new Bola();
        
        Balok.tampilHasil();
        Tabung.tampilHasil();
        Bola.tampilHasil();
    }
    
}
