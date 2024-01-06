/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author Gilang
 */
public class Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Program Perhitungan Lama Tabungan Sampai Mencapai Saldo Tertentu
        int saldoAwal = 1000000;
        double bunga = 0.1;
        int i = 0;
        
        while(saldoAwal <= 2000000){
            i += 1;
            double diskon = saldoAwal * bunga;
            
            saldoAwal += diskon;
            
            System.out.println("Saldo di bukan ke-" +i+ " : " + "Rp. " + saldoAwal);
        } 
        
    }
    
}