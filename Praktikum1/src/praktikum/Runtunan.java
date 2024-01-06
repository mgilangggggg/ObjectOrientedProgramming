/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author Gilang
 */
public class Runtunan {
    public static void main(String[] args){
        
        int nilaiTugas, nilaiUTS, nilaiUAS;
        double nilaiAkhir;
        String nama, nim;
        char indeks;
        
        nama = "Muhamad Gilang Abdul Gani";
        nim = "10121177";
        nilaiTugas = 85;
        nilaiUTS = 80;
        nilaiUAS = 90;
        
        nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        
        System.out.println("Nama Mahasiswa \t = "+nama);
        System.out.println("Nim Mahasiswa \t = "+nim);
        System.out.println("Nilai Akhir \t = "+nilaiAkhir);
        
        if(nilaiAkhir >= 45) {
            //Badan Percabangan
            String keterangan = "Lulus";
            System.out.println(nama +" dinyatakan "+keterangan);
        } else {
            System.out.println(nama +" Dinyatakan Tidak Lulus ");
        }
        
        //Membuat Indeks Nilai Akhir
        if(nilaiAkhir >= 80 && nilaiAkhir <= 100){
            indeks = 'A';
        }
        else if(nilaiAkhir >= 65 && nilaiAkhir <80){
            indeks = 'B';
        }
        else if(nilaiAkhir >= 45 && nilaiAkhir <65){
            indeks = 'C';
        }
        else if(nilaiAkhir >= 30 && nilaiAkhir <45){
            indeks = 'D';
        }
        else {
            indeks = 'E';
        }
        
        System.out.println("Indeks Nilai Akhir \t: " +indeks);
    }
}
