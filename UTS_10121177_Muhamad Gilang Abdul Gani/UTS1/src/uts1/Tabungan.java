/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts1;
/**
 *
 * @author Gilang
 */
public class Tabungan {
    private int jmlPenarikan;
    private int saldo;
    private String menu;
    
    public Tabungan() {
        saldo = 2000000;
    }
    
    public int getJmlPenarikan() {
        return jmlPenarikan;
    }
    
    public void setJmlPenarikan(int jmlPenarikan) {
        this.jmlPenarikan = jmlPenarikan;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
    
    public void penarikan() {
        if (jmlPenarikan <= saldo) {
            saldo -= jmlPenarikan;
            System.out.println("- PENARIKAN TABUNGAN BERHASIL -");
            System.out.println("Jumlah Saldo Saat ini : "+ this.saldo);
        }
        else{
            System.out.println("- SALDO TIDAK MENCUKUPI -");
        }
        System.out.println("");
    }
}
