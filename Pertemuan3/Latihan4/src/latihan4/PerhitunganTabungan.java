
package latihan4;

/**
 *
 * @author Gilang
 */
public class PerhitunganTabungan {

    public static void main(String[] args) {
        tabungan tabungan = new tabungan();
        tabungan.saldo = 1000000;
        tabungan.i = 0;
        tabungan.bunga = 0.1;
        System.out.println("Tampil Simulasi Tabungan");
        System.out.println("=================================");
        System.out.println("");
        
        tabungan.tampilTabungan();
    } 
}
