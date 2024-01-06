/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1.apps;
import java.util.Scanner;
/**
 *
 * @author Gilang
 */
public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Membuat Object
        Scanner inputData1 = new Scanner(System.in);
        Scanner inputData2 = new Scanner(System.in);
        
        Nilai Data1 = new Nilai();
        Nilai Data2 = new Nilai();
        
        // Input
        System.out.println("+--------------------------------------------------------------+");
        System.out.println("|   === APLIKASI MENGHITUNG INDEKS & NILAI AKHIR MHS IF ===    |");
        System.out.println("+--------------------------------------------------------------+");
        System.out.println("");
        System.out.println("Masukan Identitas dan Nilai Mahasiswa ke-1");
        System.out.print("Nama Mahasiswa    : ");
        Data1.setNama(inputData1.nextLine());
        System.out.print("NIM Mahasiswa     : ");
        Data1.setNim(inputData1.nextInt());
        System.out.print("Kelas Mahasiswa   : ");
        Data1.setKelas(inputData1.next());
        System.out.print("Input Nilai Tugas : ");
        Data1.setTugas(inputData1.nextInt());
        System.out.print("Input Nilai UTS   : ");
        Data1.setUts(inputData1.nextInt());
        System.out.print("Input Nilai UAS   : ");
        Data1.setUas(inputData1.nextInt());
        System.out.println("");
        System.out.println("Masukan Identitas dan Nilai Mahasiswa ke-2");
        System.out.print("Nama Mahasiswa    : ");
        Data2.setNama(inputData2.nextLine());
        System.out.print("NIM Mahasiswa     : ");
        Data2.setNim(inputData2.nextInt());
        System.out.print("Kelas Mahasiswa   : ");
        Data2.setKelas(inputData2.next());
        System.out.print("Input Nilai Tugas : ");
        Data2.setTugas(inputData2.nextInt());
        System.out.print("Input Nilai UTS   : ");
        Data2.setUts(inputData2.nextInt());
        System.out.print("Input Nilai UAS   : ");
        Data2.setUas(inputData2.nextInt());
        System.out.println("");
        
        // Output
        System.out.println("================================================================");
        System.out.println("");
        System.out.println("Data Nilai Mahasiswa ke-1");
        Data1.dataMhs();
        Data1.na();
        System.out.println("");
        System.out.println("Data Nilai Mahasiswa ke-2");
        Data2.dataMhs();
        Data2.na();
    }
}
