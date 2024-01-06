/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts1;
import java.util.Scanner;
/**
 *
 * @author Gilang
 */
public class Gilang {

    /**
     * Nim : 10121177
     * Nama : Muhamad Gilang Abdul Gani
     * Kelas : IF-5
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        Tabungan tabungan = new Tabungan();
        
        System.out.println("APLIKASI PENARIKAN TABUNGAN");
        System.out.println("===================================");
        System.out.println("Saldo Awal Tabungan Anda : RP.2000000");
        
        System.out.println("Apakah Anda mau menarik Saldo Tabungan Anda ? ");
        System.out.print("[Y/T] : ");
        tabungan.setMenu(input.next());
        System.out.println("");
        
        while (tabungan.getMenu().equals("Y")) {
            System.out.print("Masukan jumlah Penarikan : RP.");
            tabungan.setJmlPenarikan(input.nextInt());
            tabungan.penarikan();
                
            System.out.println("Apakah Anda mau menarik Saldo Tabungan Anda ? ");
            System.out.print("[Y/T] : ");
            tabungan.setMenu(input.next());
         }
    }
}
