/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.MVC.pbo.view;

import TugasBesar.MVC.pbo.controller.LoginController;
import TugasBesar.MVC.pbo.event.LoginListener;
import TugasBesar.MVC.pbo.model.LoginModel;
import com.sun.glass.events.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author -
 */
public class LoginView extends javax.swing.JFrame implements LoginListener{

    /**
     * Creates new form LoginView
     */
    private LoginModel model;
    private LoginController controller;
    
    public LoginView() {
    JOptionPane.showMessageDialog(null, "==== SELAMAT DATANG DI APLIKASI INVETARIS BARANG KLIK 'OK' UNTUK LOGIN ====");
        initComponents();
        
        model = new LoginModel();
        model.setListener(this);
        
        controller = new LoginController();
        controller.setModel(model);
        
        //Setting frame agar tidak berubah ukuran
        this.setExtendedState(JFrame.MAXIMIZED_HORIZ);
        this.setVisible(true);
        this.setResizable(false);
        
        this.getInfoUsername().setVisible(false);
        this.getInfoPassword().setVisible(false);
    }
    
    //Getter untuk mengambil data dari pengguna

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }
    public JTextField getTxtUsername() {
        return txtUsername;
    }

    public JLabel getInfoUsername() {
        return infoUsername;
    }
    
    public JLabel getInfoPassword() {
        return infoPassword;
    }
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnMasuk = new javax.swing.JButton();
        infoPassword = new javax.swing.JLabel();
        infoUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Noto Nastaliq Urdu", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel1))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 400));

        txtUsername.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 103, 331, 50));

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 232, 331, 48));

        jLabel2.setFont(new java.awt.Font("Noto Nastaliq Urdu", 1, 24)); // NOI18N
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 52, -1, 44));

        jLabel3.setFont(new java.awt.Font("Noto Nastaliq Urdu", 1, 24)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 181, -1, 44));

        btnMasuk.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMasuk.setText("Login");
        btnMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMasukMouseClicked(evt);
            }
        });
        jPanel1.add(btnMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 313, 152, 47));

        infoPassword.setForeground(java.awt.Color.red);
        infoPassword.setText("Maksimal 8 karakter");
        jPanel1.add(infoPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        infoUsername.setForeground(java.awt.Color.red);
        infoUsername.setText("Maksimal 12 karakter");
        jPanel1.add(infoUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 160, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
        
        //Membatasi jumlah karakter
        controller.maxKarakter(this.getInfoPassword(),this.getTxtPassword(),8,evt);
        
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void btnMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMouseClicked
        // TODO add your handling code here:
        controller.loginForm(this);
    }//GEN-LAST:event_btnMasukMouseClicked

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        // TODO add your handling code here:
        //Membatasi jumlah karakter
        controller.maxKarakter(this.getInfoUsername(),this.getTxtUsername(),12,evt);
    }//GEN-LAST:event_txtUsernameKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }
    
    @Override
    public void onChange(LoginModel model) {
        this.txtUsername.setText(model.getUsername());
        this.txtPassword.setText(model.getPassword());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMasuk;
    private javax.swing.JLabel infoPassword;
    private javax.swing.JLabel infoUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
