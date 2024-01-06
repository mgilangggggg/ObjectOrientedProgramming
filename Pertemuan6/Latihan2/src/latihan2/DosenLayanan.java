/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author Gilang
 */
public class DosenLayanan extends Pegawai {

    public DosenLayanan(String nama) {
        super(nama);
        super.setStatus("Dosen Luar Biasa");
        super.setAbsen("Absen Menggunakan Tanda Tangan");
    }
}
