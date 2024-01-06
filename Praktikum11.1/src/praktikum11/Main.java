/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum11;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Gilang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputBilangan = new Scanner(System.in);
        System.out.println("APLIKASI PEMBAGIAN 2 BILANGAN");
        System.out.println("=============================");
        try{
            System.out.print("Bilangan ke-1\t = ");
            int bilangan1 = inputBilangan.nextInt();
            System.out.print("Bilangan ke-2\t = ");
            int bilangan2 = inputBilangan.nextInt();
            double hasilBagi = bilangan1 / bilangan2;
            System.out.println("\nHasil Bagi = " + hasilBagi);
        }catch(ArithmeticException e) {
            System.out.println("TERJADI EXCEPTION -" +e);
        }catch(InputMismatchException ex) {
            System.out.println("TERJADI EXCEPTION -" +ex);
        }
        System.out.println("\nPROGRAM BERJALAN NORMAL");
    }
}
