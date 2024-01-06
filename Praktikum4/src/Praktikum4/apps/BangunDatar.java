
package Praktikum4.apps;

/**
 *
 * @author Gilang
 */
public class BangunDatar {
    
    //Contoh 1 Overloding, Method untuk Mencetak Jenis Bangun Datar
    void tampilBangunDatar(int sisi)
    void tampilBagunDatar(int sisi){
        tampilBangunDatar(sisi);
    }
    
    void tampilBangunDatar(double sisi){
        tampilBangunDatar(sisi);
    }
    
    void tampilBangunDatar(int panjang, int lebar){
        tampilBangunDatar(panjang, lebar);
    }
    
    void tampilBangunDatar(double panjang, double lebar){
        tampilBangunDatar(panjang, lebar);
    }
    
    int hitungLuas(int sisi){
        int luaspersegi = sisi * sisi;
        return persegi1;
    }
    
    
    public void tampilBangunDatar(int sisi){
        System.out.println("Ini adalah bangun datar PERSEGI\n"
                + "dengan sisi : "+sisi+" Yang bertipe data Integer");
    }
    
    public void tampilBangunDatar(double sisi){
        System.out.println("Ini adalah bangun datar PERSEGI\n"
                + "dengan sisi : "+sisi+" Yang bertipe data DOUBLE");
    }
    
    public void tampilBangunDatar(int panjang, int lebar){
        System.out.println("Ini adalah bangun datar PERSEGI PANJANG\n"
                + "dengan panjang : "+panjang+" dan lebar "+lebar+" "
                        + "\nyang bertipe data Integer");
    }
    
    public void tampilBangunDatar(double panjang, double lebar){
        System.out.println("ini adalah bangun datar PERSEGI PANJANG\n"
                + "dengan panjang : "+panjang+" dan lebar "+lebar+" "
                        + "\nyang bertipe data Double");
    }
}