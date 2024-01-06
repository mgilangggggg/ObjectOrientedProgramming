package latihan2;
import java.util.Scanner;
/**
 *
 * @author Gilang
 */
public class Main {
    
    public static void main (String[] args) {
        
        Scanner inputData = new Scanner(System.in);
        
        Age umur = new Age();
        System.out.println("======== APLiKASI TANDANYA KAMU ========");
        System.out.print("Masukan Tahun Lahir Anda : ");
        umur.setTahunLahir(inputData.nextInt());
        System.out.println("");
        System.out.println("======== HASIL PERHITUNGAN UMUR ========");
        umur.setTahunSkrng(2022);
        umur.hitungUmur(umur.getTahunLahir(), umur.getTahunSkrng());
    }
}