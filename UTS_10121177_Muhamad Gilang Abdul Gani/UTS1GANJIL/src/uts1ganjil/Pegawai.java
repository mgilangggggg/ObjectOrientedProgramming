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
public class Pegawai {
    private String nama;
    private String alamat;
    private String cekstatusPegawai;
    private int lamaKerja;
    private int gajiPegawai = 0;

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getCekStatusPegawai() {
        return cekstatusPegawai;
    }

    public void setCekStatusPegawai(String cekstatusPegawai) {
        this.cekstatusPegawai = cekstatusPegawai;
    }

    public int getGajiPegawai() {
        return gajiPegawai;
    }

    public void setGajiPegawai(int gajiPegawai) {
        this.gajiPegawai = gajiPegawai;
    }
}
