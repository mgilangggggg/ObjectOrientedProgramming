/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2.gilang.pbo.main;

/**
 *
 * @author Gilang
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String kelas;
    private String jurusan;
    private String alamat;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void tampilDataMahasiswa(MainView View) {
        this.setNama(View.getjTextNama().getText());
        this.setNim(View.getjTextNim().getText());
        this.setAlamat(View.getjTextAlamat().getText());
        
        if(View.getjRadioButton1().isSelected()) {
            this.setKelas("1");
        }
        
        if (View.getjRadioButton2().isSelected()) {
            this.setKelas("2");
        }
        
        if (View.getjRadioButton3().isSelected()) {
            this.setKelas("3");
        }
        
        if (View.getjRadioButton3().isSelected()) {
            this.setKelas("4");
        }
        
        if (View.getjComboBoxJurusan().getSelectedIndex() == 0) {
            this.setJurusan("TEKNIK INFORMATIKA");
        }
        
        if (View.getjComboBoxJurusan().getSelectedIndex() == 1) {
            this.setJurusan("TEKNIK ARSITEKTUR");
        }
        
        if (View.getjComboBoxJurusan().getSelectedIndex() == 2) {
            this.setJurusan("TEKNIK SIPIL");
        }
        
        if (View.getjComboBoxJurusan().getSelectedIndex() == 3) {
            this.setJurusan("TEKNIK ILMU KOMPUTER");
        }
        
        View.getjTextOutput().setText(nama+"\n" +nim+"\n" +kelas+"\n" +jurusan+"\n" +alamat);
    }
}
