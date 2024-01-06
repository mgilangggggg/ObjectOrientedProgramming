/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1.apps;

/**
 *
 * @author Gilang
 */
public class Nilai {
    private String nama, kelas;
    private int nim, tugas, uts, uas;
    private char indeks;
    final String prodi = "TEKNIK INFORMATIKA";
    
    // Method
    public Nilai() {
        
    }
    public String getNama() {
        return this.nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getNim() {
        return this.nim;
    }
    public void setNim(int nim) {
        this.nim = nim;
    }
    public String getKelas() {
        return this.kelas;
    }
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    public int getTugas() {
        return this.tugas;
    }
    public void setTugas(int tugas) {
        this.tugas = tugas;
    }
    public int getUts() {
        return this.uts;
    }
    public void setUts(int uts) {
        this.uts = uts;
    }
    public int getUas() {
        return this.uas;
    }
    public void setUas(int uas) {
        this.uas = uas;
    }
    
    // Data Mahasiswa
    public void dataMhs() {
        System.out.println("Nama Mahasiswa  : " +this.nama);
        System.out.println("NIM Mahasiswa   : " +this.nim);
        System.out.println("Kelas           : " +this.kelas);
        System.out.println("Program Studi   : " +this.prodi);
        System.out.println("Nilai Tugas     : " +this.tugas);
        System.out.println("Nilai UTS       : " +this.uts);
        System.out.println("Nilai UAS       : " +this.uas);
    }
    
    // Nilai Akhir
    public void na () {
        double na = (0.3*tugas) + (0.3*uts) + (0.4*uas);
        System.out.println("Tampil Nilai Akhir  : " +na);
        
        if ((na >= 80) && (na <= 100)) {
            indeks = 'A';
            System.out.println("Tampil Indeks Nilai : " +indeks);
        } else if ((na >= 68) && (na <= 80)) {
            indeks = 'B';
            System.out.println("Tampil Indeks Nilai : " +indeks);
        } else if ((na >= 45) && (na <= 68)) {
            indeks = 'C';
            System.out.println("Tampil Indeks Nilai : " +indeks);
        } else if ((na >= 30) && (na <= 45)) {
            indeks = 'D';
            System.out.println("Tampil Indeks Nilai : " +indeks);
        } else {
            indeks = 'E';
            System.out.println("Tampil Indeks Nilai : " +indeks);
        }
    }
}
