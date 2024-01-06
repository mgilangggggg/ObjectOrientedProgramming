/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author Gilang
 */
public abstract class BangunDatar {
    
    private int panjang;
    private int lebar;
    private String namaBangun;
    
    public abstract double hitungKeliling();
    public abstract double hitungLuas();

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    public String getNamaBangun() {
    return namaBangun;
    }

    public void setNamaBangun(String namaBangun) {
        this.namaBangun = namaBangun;
    }
}
