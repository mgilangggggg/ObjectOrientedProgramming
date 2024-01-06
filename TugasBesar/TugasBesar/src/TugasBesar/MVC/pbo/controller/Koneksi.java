package TugasBesar.MVC.pbo.controller;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Koneksi {
    Connection koneksi;
    public Connection getConnection() {
        try {
            koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/dbtugasbesar","root","");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke database gagal");
            System.exit(0);
        }
        return koneksi;
    }
}
