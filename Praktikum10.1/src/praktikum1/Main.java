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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunDatar object1 = new PersegiPanjang();
        System.out.println("Tampil Nilai Keliling" +object1.getNamaBangun()+ " = " +object1.hitungKeliling());
        System.out.println("Tampil Nilai Luas" +object1.getNamaBangun()+ " = " +object1.hitungLuas());
    }
    
}
