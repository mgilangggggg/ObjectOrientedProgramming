/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobautsganjil;
import java.util.Scanner;
/**
 *
 * @author Gilang
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputData = new Scanner(System.in);
        System.out.println("PROGRAM MENGHITUNG GAJI PEGAWAI PT.CENAT CENUT");
        System.out.println("=================================================");
        System.out.print("Masukan Status Gaji Pegawai [TETAP/HONOR] : ");
        String status = inputData.nextLine().toUpperCase();
        
        switch (status) {
            case "TETAP":
                pegawai tetap = new pegawaiTetap(status);
                tetap.tambahDataPegawai();
                tetap.tampilDataPegawai();
            break;
            case "HONOR":
                pegawai honor = new pegawaiHonor(status);
                honor.tambahDataPegawai();
                honor.tampilDataPegawai();
            break;
            default : System.out.println("MAAF STATUS KARYAWAN TIDAK ADA");
        }
        
    }
    
}
