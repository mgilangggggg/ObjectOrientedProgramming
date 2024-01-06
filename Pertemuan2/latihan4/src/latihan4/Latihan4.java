/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author Gilang
 */
public class Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Program Menghitung Nilai Akhir dan Indeks Mahasiswa

     int nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS;
     double nilaiAkhir;
     char indeks;
     
     nilaiKehadiran = 100;
     nilaiTugas = 80;
     nilaiUTS = 60;
     nilaiUAS = 75;
     
     //Bobot = Kehadiran 15%, Tugas 15%, UTS 30%, UAS 40%
     nilaiAkhir = (0.15 * nilaiKehadiran) + (0.15 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
     
     System.out.println("Masukan Nilai Kehadiran \t: " +nilaiKehadiran);
     System.out.println("Masukan Nilai Tugas \t\t: " +nilaiTugas);
     System.out.println("Masukan Nilai UTS \t\t: " +nilaiUTS);
     System.out.println("Masukan Nilai UAS \t\t: " +nilaiUAS);
     System.out.println("--------------------------------------------");
     
     // Menambahkan Percabangan untuk menentukan indeks nilai
     if(nilaiAkhir >= 80 && nilaiAkhir <= 100){
         indeks = 'A';
     }
     else if(nilaiAkhir >= 68 && nilaiAkhir <80){
         indeks = 'B';
     }
     else if(nilaiAkhir >= 45 && nilaiAkhir <68){
         indeks = 'C';
     }
     else if(nilaiAkhir >= 30 && nilaiAkhir <45){
         indeks = 'D';
     }
     else
         indeks = 'E';
     
     System.out.println("Nilai Akhir Anda \t\t: " +nilaiAkhir);
     System.out.println("Indeks Nilai Anda \t\t: " +indeks);
    }
    
}