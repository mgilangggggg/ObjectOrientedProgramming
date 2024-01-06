/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts1ganjil;

/**
 *
 * @author Gilang
 */
public class PegawaiHonor extends Pegawai {
    private int nip;
    private int jumlahAnak;
    private int tunjanganMakan;
    private int gajiPokok;
    private int totalTunjangan;
        
    public PegawaiHonor() {
        tunjanganMakan = 25000;
        super.setCekStatusPegawai("HONOR");
    }
    
    public void tampilDataPegawaiTetap() {
        System.out.println("TAMPIL DATA GAJI PEGAWAI TETAP");
        System.out.println("=======================================");
        System.out.println("Nama Pegawai : "+ super.getNama());
        System.out.println("Alamat Pegawai : "+ super.getAlamat());
        System.out.println("Status Pegawai : "+ super.getAlamat());
        System.out.println("Total Gaji Pegawai : " + super.getGajiPegawai());
        System.out.println("");
        System.out.println("Rincian Gaji Pegawai");
        System.out.println("Lama Kerja Pegawai : "+ super.getLamaKerja());
        System.out.println("Honor Pokok Pegawai : "+ this.getGajiPokok());
        System.out.println("Tunjangan Makan : "+this.tunjanganMakan);
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public int getTunjanganMakan() {
        return tunjanganMakan;
    }

    public void setTunjanganMakan(int tunjanganMakan) {
        this.tunjanganMakan = tunjanganMakan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalTunjangan() {
        return totalTunjangan;
    }

    public void setTotalTunjangan(int totalTunjangan) {
        this.totalTunjangan = totalTunjangan;
    }
}
