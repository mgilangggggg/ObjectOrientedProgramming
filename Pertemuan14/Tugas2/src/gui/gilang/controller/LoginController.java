/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.zz.controller;

import gui.gilang.model.LoginModel;
import gui.gilang.view.DashboardLogin;
import gui.gilang.view.FormLoginView;
import javax.swing.JOptionPane;

/**
 *
 * @author Gilang
 */
public class LoginController {
    
    private LoginModel model;

    public LoginModel getModel() {
        return model;
    }

    public void setModel(LoginModel model) {
        this.model = model;
    }
    
    public void LoginForm(FormLoginView View) {
        String username = View.getTxtUsername().getText();
        String password = View.getTxtPassword().getText();
        
        if("admin".equals(username) && "admin123".equals(password)){
            JOptionPane.showMessageDialog(null, "BERHASIL LOGIN");
            DashboardLogin db = new DashboardLogin();
            db.setVisible(true);

        }else{
            JOptionPane.showMessageDialog(null, "USERNAME ATAU PASSWORD SALAH");
        }
    }
}
