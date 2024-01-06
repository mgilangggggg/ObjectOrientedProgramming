
package Praktikum4.apps;

/**
 *
 * @author Gilang
 */
public class Produk {
    private String nama;
    private int harga;
    private int jumlah;
    
    public Produk(){
        
    }
    
    public Produk(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }
    
    public String getnama(){
        return this.nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void tampilDataProduk(){
        System.out.println("Nama Produk : " +this.nama);
        System.out.println("Harga Produk : Rp. " +this.harga);
        System.out.println("Stok saat ini : " +this.jumlah);
        
    }
    
}
