/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum2;

/**
 *
 * @author Gilang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Cara Pertama
        Manusia gilang = new Manusia("Muhamad Gilang Abdul Gani");
        //gilang.nama = "Muhamad Gilang Abdul Gani";
        gilang.alamat = "Desa Mekarbuana";
        gilang.umur = 22;
        
        gilang.tampilBiodata(); //Mengakses method tampilBiodata() tanpa parameter
        System.out.println("");
        System.out.println(gilang.sayHello("User")); //Mengakses method sayHello() dengan 1 parameter bertipe String
        System.out.println("");
        
        /*
        //Cara kedua
        Manusia angga;
        angga = new Manusia();
        
        angga.nama = "Angga Setiyadi";
        angga.alamat = "Margahayu Raya";
        angga.umur = 24;
        
        System.out.println("Nama Saya   : " +angga.nama);
        System.out.println("Alamat      : " +angga.alamat);
        System.out.println("Umur        : " +angga.umur);
        System.out.println("Negara Asal : " +angga.negara);
        */
    }
    
}
