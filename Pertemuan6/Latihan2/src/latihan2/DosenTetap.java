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
public class DosenTetap extends Pegawai {
    
    private String NIP;

    public DosenTetap(String nama, String NIP) {
        super(nama);
        super.setStatus("Dosen Tetap");
        super.setAbsen("Absen Menggunakan Sidik Jari");
        this.setNIP(NIP);
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
}
