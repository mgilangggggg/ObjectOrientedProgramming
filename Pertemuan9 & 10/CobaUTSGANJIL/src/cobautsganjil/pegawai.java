/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobautsganjil;

/**
 *
 * @author Gilang
 */
public class pegawai {
    
    private String nama;
    private String alamat;
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
//    Deklarasi Method
    public double hitungGajiPegawai() {
        return 0;
    }
    
    public void tambahDataPegawai() {
        
    }
    
    public void tampilDataPegawai() {
        System.out.println("Nama Pegawai   : " + this.nama);
        System.out.println("Alamat Pegawai : " + this.alamat);
        System.out.println("Status         : " + this.status);
        
    }
}
