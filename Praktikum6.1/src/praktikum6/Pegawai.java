/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6;

/**
 *
 * @author Gilang
 */
public class Pegawai {
    
    //Deklarasi Atribut pada class Pegawai
    protected String nama;
    protected String alamat;
    protected String noTelepon;
    
    //Deklarasi Construktor dengan 1 parameter String
    public Pegawai(String nama) {
        this.nama = nama;
    }
    
    //Deklarasi Getter & Setter untuk atribut Private
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

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }
    
    public void tampilStatus() {
        System.out.println(this.nama+" adalah PEGAWAI di UNIKOM");
    }
}
