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
public class PegawaiTetap extends Pegawai{
    private int nip, jumlahAnak, tunjanganAnak, tunjanganTransportasi, gajiPokok, totalTunjangan; 
    
    
    public PegawaiTetap() {
        tunjanganTransportasi = 370000;
        super.getNama();
        super.setCekStatusPegawai("TETAP");
    }

    /**
     * @return the nip
     */
    public int getNip() {
        return nip;
    }

    /**
     * @param nip the nip to set
     */
    public void setNip(int nip) {
        this.nip = nip;
    }

    /**
     * @return the jumlahAnak
     */
    public int getJumlahAnak() {
        return jumlahAnak;
    }

    /**
     * @param jumlahAnak the jumlahAnak to set
     */
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    /**
     * @return the tunjanganAnak
     */
    public int getTunjanganAnak() {
        return tunjanganAnak;
    }

    /**
     * @param tunjanganAnak the tunjanganAnak to set
     */
    public void setTunjanganAnak(int tunjanganAnak) {
        this.tunjanganAnak = tunjanganAnak;
    }

    /**
     * @return the tunjanganTransportasi
     */
    public int getTunjanganTransportasi() {
        return tunjanganTransportasi;
    }

    /**
     * @param tunjanganTransportasi the tunjanganTransportasi to set
     */
    public void setTunjanganTransportasi(int tunjanganTransportasi) {
        this.tunjanganTransportasi = tunjanganTransportasi;
    }
    
    public void kalkulasi() {
        if (super.getLamaKerja() <= 5) {
            gajiPokok = 2500000;
            tunjanganAnak = 400000 * jumlahAnak;
            totalTunjangan = tunjanganAnak + tunjanganTransportasi;
            super.setGajiPegawai(gajiPokok + tunjanganTransportasi);
        }
        else if (super.getLamaKerja() <= 10) {
            gajiPokok = 4700000;
            tunjanganAnak = 400000 * jumlahAnak;
            totalTunjangan = tunjanganAnak + tunjanganTransportasi;
            super.setGajiPegawai(gajiPokok + tunjanganTransportasi);
        }
        else if (super.getLamaKerja() <= 20) {
            gajiPokok = 6500000;
            tunjanganAnak = 400000 * jumlahAnak;
            totalTunjangan = tunjanganAnak + tunjanganTransportasi;
            super.setGajiPegawai(gajiPokok + tunjanganTransportasi);
        }
        else if (super.getLamaKerja() > 20) {
            gajiPokok = 10000000;
            tunjanganAnak = 400000 * jumlahAnak;
            totalTunjangan = tunjanganAnak + tunjanganTransportasi;
            super.setGajiPegawai(gajiPokok + tunjanganTransportasi);
        }

    }
    
    public void tampilDataPegawaiTetap() {
        System.out.println("TAMPIL DATA GAJI PEGAWAI TETAP");
        System.out.println("=======================================");
        System.out.println("NIP Pegawai : "+ this.nip);
        System.out.println("Nama Pegawai : "+ super.getNama());
        System.out.println("Alamat Pegawai : "+ super.getAlamat());
        System.out.println("Status Pegawai : "+ super.getCekStatusPegawai());
        System.out.println("Total Gaji Pegawai : " + super.getGajiPegawai());
        System.out.println("");
        System.out.println("Rincian Gaji Pegawai");
        System.out.println("Lama Kerja Pegawai : "+ super.getLamaKerja() + " Tahun");
        System.out.println("Jumlah Anak : "+ this.jumlahAnak);
        System.out.println("Gaji Pokok Pegawai : "+ this.gajiPokok);
        System.out.println("Tunjanan Anak : "+ this.tunjanganAnak);
        System.out.println("Tunjangan Transportasi : "+ this.tunjanganTransportasi);
    }
}
