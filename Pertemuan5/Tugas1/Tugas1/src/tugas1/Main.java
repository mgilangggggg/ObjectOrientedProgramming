/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Mika
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Buat object dari kelas Mahasiswa, sesuaikan kebutuhan dengan kasus
        Mahasiswa mahasiswa1 = new Mahasiswa("Teknik Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Teknik Informatika");
        
        //Kode program untuk membuat tampilan menu Utama Program
        System.out.println("=======APLIKASI MENGHITUNG INDEKS & NILAI AKHIR MHS IF=======\n");
        System.out.println("Masukan Identitas dan Nilai Mahasiswa ke-1");
        mahasiswa1.tambahDataMahasiswa();
        mahasiswa1.tambahDataNilai();
        System.out.println("");
        System.out.println("Masukan Identitas dan Nilai Mahasiswa ke-2");
        mahasiswa2.tambahDataMahasiswa();
        mahasiswa2.tambahDataNilai();
        System.out.println("===============================================================");  
        //Menampilkan Data Nilai Mahasiswa, panggil methodnya dari kelas Mahasiswa
        System.out.println("Data Nilai Mahasiswa ke-1");
        mahasiswa1.tampilDataMahasiswa();
        System.out.println("");
        System.out.println("Data Nilai Mahasiswa ke-2");
        mahasiswa2.tampilDataMahasiswa(); 
    }
    
}
