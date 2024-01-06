/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;
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
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Pengemudi Gilang = null;
        int pilih;
        
        System.out.print("Masukan Type Mobil [1/2/3] : ");
        pilih = input.nextInt();
        System.out.println("");
        
        switch (pilih){
            case 1:
                Mobil avanza = new Avanza();
                Gilang = new Pengemudi(avanza);
            break;
            case 2:
                Mobil brio = new Brio();
                Gilang = new Pengemudi (brio);
            break;
            case 3:
                Mobil jazz = new Jazz();
                Gilang = new Pengemudi (jazz);
            break;
            default : System.out.println("Salah input Type Mobil");
        }
        
        Gilang.tampilSpesifikasi();
        Gilang.menyalakanMobil();
        Gilang.menginjakGas();
    }
    
}
