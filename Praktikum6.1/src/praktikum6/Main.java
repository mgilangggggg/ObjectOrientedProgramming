/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6;

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
        /*Deklarasi Object dari Class DosenTetap & DosenLayanan
            Isilah nama, alamat, & noTelepon kemudian tampilkan ke layar*/
        DosenTetap Pegawai1 = new DosenTetap("Naruto");
        DosenLayanan Pegawai2 = new DosenLayanan("Sasuke");
        
        //Data Pegawai ke-1
        //Pegawai1.setNama("Otsuka");
        Pegawai1.setNip("10121122");
        Pegawai1.setAlamat("Osaka");
        Pegawai1.setNoTelepon("0312345678");
        System.out.println("Data Pegawai UNIKOM ke-1");
        System.out.println("Nama Pegawai    : "+Pegawai1.getNama());
        System.out.println("NIP Pegawai     : "+Pegawai1.getNip());
        System.out.println("Alamat          : "+Pegawai1.getAlamat());
        System.out.println("No Telepon      : "+Pegawai1.getNoTelepon());
        Pegawai1.tampilStatus();
        System.out.println("");
        
        //Data Pegawai ke-2
        //Pegawai2.setNama("Sakura Chan");
        Pegawai2.setAlamat("Yokohama");
        Pegawai2.setNoTelepon("0312345577");
        System.out.println("Nama Pegawai UNIKOM ke-2");
        System.out.println("Nama Pegawai    : "+Pegawai2.getNama());
        System.out.println("Alamat          : "+Pegawai2.getAlamat());
        System.out.println("No Telepon      : "+Pegawai2.getNoTelepon());
        Pegawai2.tampilStatus();
        System.out.println("");
    }
    
}
