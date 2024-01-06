/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;
import java.util.Scanner;
/**
 *
 * @author Gilang
 */
public class User {
    private String user;
    private String password;
    private int login = 0;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }
    
   public void inputDataUser () {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Username Anda : ");
        setUser(input.nextLine());
        System.out.print("Masukan Password Anda : ");
        setPassword(input.nextLine());
    }
    
    public void tampilDataUser () throws ValidateUserException {
        
        if ("".equals(this.user)) {
            throw new ValidateUserException("'Username Tidak Boleh Kosong'");
        } else if ("".equals(this.password)) {
            throw new ValidateUserException("'Password Tidak Boleh Kosong'");
        } else if (this.password.length() > 8){
            throw new ValidateUserException("'Password Tidak Boleh lebih dari 8 Huruf'");
        } else if (!"admin".equals(this.user) && !"admin123".equals(this.password)) {
            throw new ValidateUserException("'Username atau Password Yang Anda Masukan Salah'");
        } else {
            this.setLogin(1);
            System.out.println("Login Berhasil");
        }
    }
}
