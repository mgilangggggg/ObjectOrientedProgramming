package TugasBesar.MVC.pbo.controller;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import TugasBesar.MVC.pbo.model.LoginModel;
import TugasBesar.MVC.pbo.view.LoginView;
import java.sql.Connection;
import java.sql.SQLException;

public class LoginController {
    
    private LoginModel model;

    public LoginModel getModel() {
        return model;
    }
    public void setModel(LoginModel model) {
        this.model = model;
    }
    
    //Method di dalam Controller
    public void loginForm(LoginView view){
        String username = view.getTxtUsername().getText();
        String password = view.getTxtPassword().getText();
        
        //Validasi
        String message = null;
        if(username.length() == 0){
            message = "'Username Tidak Boleh Kosong'";
        }else if(password.length() == 0){
            message = "'Password Tidak Boleh Kosong'";
        }else{
            //Pengecekan Username dan Password dari database
            try{
                String sql = "SELECT LOGIN.USERNAME,LOGIN.PASSWORD FROM `login` WHERE LOGIN.USERNAME='"+username+"' AND LOGIN.PASSWORD='"+password+"'";
                java.sql.Connection conn = new Koneksi().getConnection();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet res = stm.executeQuery(sql);

                if(!res.next()){
                    message = "'Username atau Password Yang Anda Masukan Salah'";
                }
            }catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Koneksi ke database gagal" + e.getMessage());
            }
        }
        
        if(message == null){
            model.setUsername(username);
            model.setPassword(password); 
            view.dispose();
            
            model.loginForm(username);
        }else{
            JOptionPane.showMessageDialog(view, message);
            model.resetForm();
        } 
        
    }
    
}
