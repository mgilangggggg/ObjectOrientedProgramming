/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum11.pkg2;
import java.util.InputMismatchException;

/**
 *
 * @author Gilang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        
        System.out.println("APLIKASI PEMBAGIAN BILANGAN");
        System.out.println("===========================");
        try {
            kalkulator.tambahBilangan();
            kalkulator.tampilHasilPerhitungan();
        }catch(ValidasiAngkaException ex) {
            System.out.println("TERJADI KESALAHAN -" +ex);
        }
        
        System.out.println("\nPROGRAM BERJALAN DENGAN NORMAL");
        
    }    
}
