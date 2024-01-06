
package latihan3;

/**
 *
 * @author Gilang
 */
public class PerhitunganLuasdanKeliling {
    
    public static void main(String[] args) {
        //Tampil Persegi
        persegi persegi = new persegi();
        persegi.sisi = 10;
        System.out.println("Menghitung Keliling dan Luas Persegi");
        System.out.println("============================================");
        System.out.println("");
        
        persegi.tampilPersegi();
        System.out.println("");
        
        //Tampil Persegi Panjang
        persegiPjg persegiPjg = new persegiPjg();
        persegiPjg.panjang = 10;
        persegiPjg.lebar = 5;
        System.out.println("Menghitung Keliling dan Luas Persegi Panjang");
        System.out.println("============================================");
        System.out.println("");
        
        persegiPjg.tampilPersegiPjg();
        System.out.println("");
        
        //Tampil Lingkaran
        lingkaran lingkaran = new lingkaran();
        lingkaran.jari_jari = 7;
        lingkaran.PHI = 3.14;
        System.out.println("Menghitung Keliling dan Luas Lingkaran");
        System.out.println("============================================");
       
        System.out.println("");
        lingkaran.tampilLingkaran();
    } 
}
