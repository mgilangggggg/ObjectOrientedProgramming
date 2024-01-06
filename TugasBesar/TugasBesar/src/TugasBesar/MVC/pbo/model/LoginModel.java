package TugasBesar.MVC.pbo.model;

import javax.swing.JOptionPane;
import TugasBesar.MVC.pbo.event.LoginListener;
import TugasBesar.MVC.pbo.view.DashboardView;
import TugasBesar.MVC.pbo.view.LoginView;

public class LoginModel {
    
    //attribut untuk data dari form login
    private String username;
    private String password;
    private LoginListener listener;

    public LoginListener getListener() {
        return listener;
    }
    public void setListener(LoginListener listener) {
        this.listener = listener;
    }
    
    
    //Getter dan setter untuk setiap attribut
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
        this.fireOnChange();
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
        this.fireOnChange();
    }
    
    protected void fireOnChange(){
    if(listener != null){
        this.listener.onChange(this);
        }
    }
    
    
    //Method untuk menjalankan proses pada model
    public void loginForm(String username){        
        DashboardView dashboard = new DashboardView();
        dashboard.setVisible(true);
        
    }
    
    public void resetForm(){
        this.setUsername("");
        this.setPassword("");
    }
    
    
}
