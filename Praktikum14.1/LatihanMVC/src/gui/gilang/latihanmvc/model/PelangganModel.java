/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.gilang.latihanmvc.model;
import gui.gilang.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Gilang
 */
public class PelangganModel {
    
    // Deklarasi Atribut yg digunnakan untuk menampung data dari Form Pelanggan
    private String nama;
    private String email;
    private String noTelepon;
    private String Alamat;
    
    private PelangganListener listener;

    public PelangganListener getListener() {
        return listener;
    }

    public void setListener(PelangganListener listener) {
        this.listener = listener;
    }

    // Menambahkan Gettet Setter dari setiap atribut pada class pelanggganModel
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
        this.fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        this.fireOnChange();
    }
    
    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
        this.fireOnChange();
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
        this.fireOnChange();
    }
    
    protected void fireOnChange() {
        if(listener != null) {
            listener.onChange(this);
        }
    }
    
    // Method menjalankan proses pada model
    public void simpanForm() {
        // membuat aksi ketika button simpan di click
        JOptionPane.showMessageDialog(null, "Data Pelanggan Berhasil Disimpan");
    }
    
    public void resetForm() {
        
        // membuat aksi ketika bbutton reset di click
        this.setNama("");
        this.setEmail("");
        this.setNoTelepon("");
        this.setAlamat("");
    }
}
