
package latihan1;
import java.util.Scanner;
import latihan1.Printer;
/**
 *
 * @author Gilang
 */
public class Main {

    public static void main (String[] args) {
        
        Scanner inputData = new Scanner(System.in);
        
        Printer cetak = new Printer();
        System.out.println("======== Aplikasi Pencetak Nama ========");
        System.out.println("");
        System.out.print("Masukan Nama Anda : ");
        cetak.setNama(inputData.nextLine());
        System.out.print("Mau Cetak Berapa Kali ? : ");
        cetak.setJmlCetak(inputData.nextInt());
        cetak.tampilCetak(cetak.getNama(), cetak.getJmlCetak());
    }
}