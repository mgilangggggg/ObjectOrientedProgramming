/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.controller;

import gui.model.LoginModel;
import gui.view.DashboardLogin;
import gui.view.FormLoginView;
import javax.swing.JOptionPane;

/**
 *
 * @author
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
        String user = View.getTxtUser().getText();
        String pass = View.getTxtPass().getText();
        
    }
}