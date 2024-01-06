/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Gilang
 */
public class koneksi {
    private static Connection con;
    public static Statement stat;
    
    public static void main(String args[]){
        try{
            String url = "jdbc:mysql://localhost/db_invetaris";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user, password);
            stat = con.createStatement();
            System.out.println("Koneksi Berhasil");
        
        }catch(Exception e) {
            System.err.println("Koneksi Gagal" + e.getMessage());
        }
    }
}
