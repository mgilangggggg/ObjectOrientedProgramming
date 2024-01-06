
package Praktikum4.apps;
//import java.util.Scanner;
/**
 *
 * @author Gilang
 */
public class Main {
    
    public static void main(String[] args){
        
        BangunDatar persegi1 = new BangunDatar(10);
        System.out.println("Luas Bangun Datar = " +persegi1.hitungLuas(10));
        System.out.println("");
        
        BangunDatar persegi2 = new BangunDatar(7.5);
        System.out.println("Luas Bangun Data = " +persegi2.hitungLuas(7.5));
        System.out.println("");
        
        BangunDatar persegi3 = new BangunDatar(4, 5);
        System.out.println("Luas Bangun Datar = " +persegi3.hitungLuas(4, 5));
        System.out.println("");
        
        BangunDatar persegi4 = new BangunDatar(5.5, 10.5);
        System.out.println("Luas Bangun Datar = " +persegi4.hitungLuas(5.5, 10.5));
        System.out.println("");
        
        /*
        Kotak kotak1 = new Kotak(10, 5);
        Kotak kotak2 = new Kotak(4, 12);
        Kotak kotak3 = new Kotak(kotak2);
        */
        
        /*
        System.out.println("Kotak 1");
        kotak1.tampilDataKotak();
        System.out.println("");
        System.out.println("Kotak 2");
        kotak2.tampilDataKotak();
        System.out.println("");
        System.out.println("Kotak 3");
        kotak3.tampilDataKotak();
        */
        //Object Dari class Scanner
//        Scanner inputData = new Scanner(System.in);
        
        /*
        Produk produk1 = new Produk();
        */
        /*produk1.nama = "SingkongOri";
        produk1.harga = 10000;
        produk1.jumlah = 10;
        
        System.out.print("Masukan Nama Produk : ");
        produk1.setNama(inputData.nextLine());
        System.out.print("Masukan Nama Produk : ");
        produk1.setHarga(inputData.nextInt());
        System.out.println("Masukan Stok Barang : ");
        produk1.setJumlah(inputData.nextInt());
        
        System.out.println("Tampil data produk 1");
        System.out.println("====================");
        produk1.tampilDataProduk();
        System.out.println("");
        Produk produk2 = new Produk("Singkong Pedas", 12000);
        produk2.jumlah = 20;
        System.out.println("Tampil data produk 2");
        System.out.println("====================");
        produk2.tampilDataProduk();
        */
    }
}
