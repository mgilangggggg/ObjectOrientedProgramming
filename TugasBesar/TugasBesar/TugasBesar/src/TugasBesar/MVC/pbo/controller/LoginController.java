package TugasBesar.MVC.pbo.controller;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import TugasBesar.MVC.pbo.model.LoginModel;
import TugasBesar.MVC.pbo.view.LoginView;
import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

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
                if(res.next()){
                    if((!res.getString("username").equals(username)) || (!res.getString("password").equals(password))){
                        message = "'Username atau Password Yang Anda Masukan Salah";
                        
                    }
                }else if(!res.next()){
                    message = "'Username atau Password Yang Anda Masukan Salah'";
                }
            }catch (SQLException e){
                message = "'Tabel database untuk login tidak dapat ditemukan'";
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
    
    public void maxKarakter(JLabel info,JTextField karakter,int jumlahBatasKarakter,java.awt.event.KeyEvent evt){
        
        //Membaca jumlah angka yang dimasukkan oleh user
        int length = karakter.getText().length();
        
        //Pengecekan jumlah password yang dimasukkan oleh user
        if((length<jumlahBatasKarakter)||(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE) || (evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)){
            karakter.setEditable(true);
            info.setVisible(false);
        }else{
            karakter.setEditable(false);
            info.setVisible(true);
        }
    }
    
    
    
}
