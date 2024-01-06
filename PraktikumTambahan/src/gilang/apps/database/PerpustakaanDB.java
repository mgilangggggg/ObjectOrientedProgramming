/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gilang.apps.database;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gilang
 */
public class PerpustakaanDB {
    
    private static Connection connection;
    private static Connection getConnection() throws SQLException{
        
        if (connection == null) {
            // Membuat Koneksi
            MysqlDataSource datasource = new MysqlDataSource();

            datasource.setURL("jdbc:mysql://localhost:3306/perpustakaan_db");
            datasource.setUser("root");
            datasource.setPassword("");
            
            connection = (Connection) datasource.getConnection();
            
            
        }
        return connection;
    }
}
