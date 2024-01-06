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
public class PersegiPanjang extends BangunDatar {
    
    public PersegiPanjang(){
        super.setPanjang(10);
        super.setLebar(5);
        super.setNamaBangun("Persegi Panjang");
    }
    

    @Override
    public double hitungKeliling() {
        double keliling;
        keliling = 2*super.getPanjang() + 2*super.getLebar();
        return keliling;
    }

    @Override
    public double hitungLuas() {
        double luas;
        luas = super.getPanjang() * super.getLebar();
        return luas;
    }

}
