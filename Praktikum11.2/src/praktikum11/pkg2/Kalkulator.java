/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum11.pkg2;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Gilang
 */
public class Kalkulator {
    private int bilangan1;
    private int bilangan2;

    public int getBilangan1() {
        return bilangan1;
    }

    public void setBilangan1(int bilangan1) {
        this.bilangan1 = bilangan1;
    }

    public int getBilangan2() {
        return bilangan2;
    }

    public void setBilangan2(int bilangan2) {
        this.bilangan2 = bilangan2;
    }
//    Deklarasi Method dari Class Kalkulator
    public void tambahBilangan() throws ValidasiAngkaException{
        Scanner inputBilangan = new Scanner(System.in);
        try{
            System.out.print("Bilangan ke-1\t = ");
            this.setBilangan1(inputBilangan.nextInt());
            System.out.print("Bilangan ke-2\t = ");
            this.setBilangan2(inputBilangan.nextInt());
        }catch(InputMismatchException ex){
            String message = "Nilai Bilangan Harus  Bertype Integer";
            throw new ValidasiAngkaException(message);
        }
        
    }
    
    public void tampilHasilPerhitungan() {
        try{
        double hasilBagi = this.pembagian();
        System.out.println("Hasil Pembagian = "+hasilBagi);
        }catch(ArithmeticException e){
            System.out.println("TERJADI EXCEPTION -" +e);
        }
    }
    
    public double pembagian() {
        double hasilBagi;
        hasilBagi = this.bilangan1 / this.bilangan2;
        return hasilBagi;
    }
}
