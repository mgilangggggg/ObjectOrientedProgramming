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
public class pegawaiHonor extends pegawai{
    private int jmlHari;
    private int honorPokok;
    private int tunjanganMakan;
    
    public pegawaiHonor(String status) {
        super.setStatus(status);
        this.honorPokok = 120000;
        this.tunjanganMakan = 25000;
    }

    public int getJmlHari() {
        return jmlHari;
    }

    public void setJmlHari(int jmlHari) {
        this.jmlHari = jmlHari;
    }

    public int getHonorPokok() {
        return honorPokok;
    }

    public void setHonorPokok(int honorPokok) {
        this.honorPokok = honorPokok;
    }

    public int getTunjanganMakan() {
        return tunjanganMakan;
    }

    public void setTunjanganMakan(int tunjanganMakan) {
        this.tunjanganMakan = tunjanganMakan;
    }
    
//    Deklarasi Method Pegawai Hononr
    @Override
    public double hitungGajiPegawai() {
        double gajiPegawai;
        gajiPegawai = (this.jmlHari * this.honorPokok) + (this.jmlHari * this.tunjanganMakan);
        return gajiPegawai;
    }
    
    @Override
    public void tambahDataPegawai() {
        Scanner inputData = new Scanner(System.in);
        
        System.out.println("Tambah Data Pegawai Honor");
        System.out.println("=========================");
        System.out.print("Masukan Nama Pegawai   : ");
        super.setNama(inputData.nextLine());
        System.out.print("Masukan Alamat Pegawai : ");
        super.setAlamat(inputData.nextLine());
        System.out.print("Jumlah Hari Kerja      : ");
        this.setJmlHari(inputData.nextInt());
    }
    
    @Override
    public void tampilDataPegawai() {
        
        int totalTunjangan;
        totalTunjangan = this.jmlHari * this.tunjanganMakan;
        
        super.tambahDataPegawai();
        System.out.print("Total Gaji Pegawai      : " + this.hitungGajiPegawai());
        System.out.println("");
        System.out.println("Rincian Gaji Pegawai");
        System.out.println("JUmlah Hari Keraja    : " + this.jmlHari);
        System.out.println("Honor Pokok Pegawai   : " + this.honorPokok);
        System.out.println("Total Tunjangan Makan : " + totalTunjangan);
    }
    
}
