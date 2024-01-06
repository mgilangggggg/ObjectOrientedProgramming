/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.gilang.model;

import gui.gilang.event.LoginListener;

/**
 *
 * @author Gilang
 */
public class LoginModel {
    
    private String username;
    private String password;
    
    private LoginListener listener;

    public LoginListener getListener() {
        return listener;
    }

    public void setListener(LoginListener listener) {
        this.listener = listener;
        this.fireOnChange();
    }

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
    
    protected void fireOnChange() {
    if(listener != null) {
        listener.onChnge(this);
    }
    }
    
    public void LoginForm() {
        
    }
}
