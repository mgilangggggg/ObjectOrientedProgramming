/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.gilang.latihanmvc.controller;

import gui.gilang.latihanmvc.model.PelangganModel;
import gui.gilang.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author Gilang
 */
public class PelangganController {
    
    private PelangganModel model;

    public PelangganModel getModel() {
        return model;
    }

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    // Method Didalam Controller
    public void simpanForm(PelangganView View) {
        String nama = View.getTxtNama().getText();
        String email = View.getTxtEmail().getText();
        String noTelepon = View.getTxtNoTelepon().getText();
        String alamat = View.getTxtAlamat().getText();
        
        // Validasi
        if(nama.trim().equals("")) {
            JOptionPane.showMessageDialog(View, "FIELD NAMA TIDAK BOLEH KOSONG");
        }else if(email.trim().equals("")) {
            JOptionPane.showMessageDialog(View, "FIELD EMAIL TIDAK BOLEH KOSONG");
        }else if(noTelepon.trim().equals("")) {
            JOptionPane.showMessageDialog(View, "FIELD NO TELEPON TIDAK BOLEH KOSONG");
        }else if (alamat.trim().equals("")) {
            JOptionPane.showMessageDialog(View, "FIELD ALAMAT TIDAK BOLEH KOSONG");
        }else{
            model.setNama(nama);
            model.setEmail(email);
            model.setNoTelepon(noTelepon);
            model.setAlamat(alamat);
            
            model.simpanForm();
        }
    }
    
    public void resetForm(PelangganView View) {
        
        String nama = View.getTxtNama().getText();
        String email = View.getTxtEmail().getText();
        String noTelepon = View.getTxtNoTelepon().getText();
        String alamat = View.getTxtAlamat().getText();
        
        // Validasi
        if(nama.equals("") && email.equals("") && noTelepon.equals("") && alamat.equals("")) {
            JOptionPane.showMessageDialog(View, "FORM PELANGGAN BELUM DIISI");
        }else{
            model.resetForm();
        }
    }
}
