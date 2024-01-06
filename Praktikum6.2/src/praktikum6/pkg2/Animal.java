/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6.pkg2;

/**
 *
 * @author Gilang
 */
public class Animal {
    //Deklarasi Atribut dari Class Animal
    private String nama;
    
    //Deklarasi Construktor
    public Animal() {
        nama = "...";
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void sound() {
        System.out.println(getNama()+" dapat BERSUARA");
        System.out.println("");
    }
}
