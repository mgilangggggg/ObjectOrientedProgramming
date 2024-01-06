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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pegawai pegawai1 = new DosenTetap("Chrismikha Hardyanto,S.Kom., M.Kom", "4217069201");
        Pegawai pegawai2 = new DosenLayanan("Resti Novianti");
        Pegawai pegawai3 = new DosenTetap("Adam Mukharil B", "4217068601");
         
        System.out.println("Nama Dosen   :  " +pegawai1.getNama());
        System.out.println("Status Dosen :  " +pegawai1.getStatus());
        System.out.println("NIP Dosen    :  " +((DosenTetap) pegawai1).getNIP());
        System.out.println("Cara Absen   :  " +pegawai1.getAbsen());
        System.out.println("");

        System.out.println("Nama Dosen   :  " +pegawai2.getNama());
        System.out.println("Status Dosen :  " +pegawai2.getStatus());
        System.out.println("Absen        :  " +pegawai2.getAbsen());
        System.out.println("");

        System.out.println("Nama Dosen   :  " +pegawai3.getNama());
        System.out.println("Status Dosen :  " +pegawai3.getStatus());
        System.out.println("NIP Dosen    :  " +((DosenTetap) pegawai3).getNIP());
        System.out.println("Cara Absen   :  " +pegawai3.getAbsen());
        System.out.println("");
    }
}
