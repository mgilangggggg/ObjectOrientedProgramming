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
public class DosenTetap extends Pegawai{
    
    //Deklarasi Atribut dari Class DosenTetap
    private String nip;
    
        //Deklarasi Construktor dengan 1 parameter String
        public DosenTetap(String nama) {
            //Gunakan Kata Kunci super untuk memanggil Construktor di dalam class parent
            super(nama);
    }    
    //Deklarasi Getter & Setter
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}
