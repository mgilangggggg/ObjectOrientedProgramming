/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author Gilang
 */
public class ButtonSimpan implements Button, Event {
    
    private int Panjang;
    private int Lebar;
    private String namaButton;
    private String warna;
    
    public ButtonSimpan() {
        this.createButton();
    }


    public int getPanjang() {
        return Panjang;
    }

    public void setPanjang(int Panjang) {
        this.Panjang = Panjang;
    }

    public int getLebar() {
        return Lebar;
    }

    public void setLebar(int Lebar) {
        this.Lebar = Lebar;
    }

    public String getNamaButton() {
        return namaButton;
    }

    public void setNamaButton(String namaButton) {
        this.namaButton = namaButton;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    
    
    @Override
    public void createButton() {
        this.setPanjang(10);
        this.setLebar(5);
        this.setNamaButton("Button Simpan");
        this.setWarna("Biru");
    }

    @Override
    public void viewButton() {
        System.out.println("Panjang Button = " +this.Panjang);
        System.out.println("Lebar Button   = " +this.Lebar);
        System.out.println("Nama Button    = " +this.namaButton);
        System.out.println("Warna          = " +this.warna);
    }

    @Override
    public void isClicked() {
        System.out.println("Ketika Button di Clicked, Akan melakukan proses menyimpan data");
    }
    
}
