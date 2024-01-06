/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3b.gilang.pbo.main;

import javax.swing.JFrame;

/**
 *
 * @author Gilang
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        
        // menonaktifkan fungsi maximized pada tampilan program
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBilangan1 = new javax.swing.JTextField();
        txtBilangan2 = new javax.swing.JTextField();
        cmbOperasi = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHasil = new javax.swing.JTextArea();
        btnHitung = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator Sederhana");

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel6.setText("KALKULATOR SEDERHANA");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 16, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("BILANGAN 1 :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 92, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("BILANGAN 2 :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 172, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("OPERASI      :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 247, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("HASIL          :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        txtBilangan1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel2.add(txtBilangan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 77, 409, 50));

        txtBilangan2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel2.add(txtBilangan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 157, 409, 50));

        cmbOperasi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cmbOperasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENJUMLAHAN", "PENGURANGAN", "PERKALIAN", "PEMBAGIAN" }));
        jPanel2.add(cmbOperasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 232, 409, 50));

        txtHasil.setColumns(20);
        txtHasil.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtHasil.setRows(5);
        jScrollPane1.setViewportView(txtHasil);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 410, 60));

        btnHitung.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnHitung.setText("HITUNG");
        btnHitung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHitungMouseClicked(evt);
            }
        });
        jPanel2.add(btnHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 319, 200, 50));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 319, 200, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHitungMouseClicked
        // mengambil nilai bilangan
        
        double bilangan1 = Double.valueOf(txtBilangan1.getText());
        double bilangan2 = Double.valueOf(txtBilangan2.getText());
        
        // operasi perhitungan
        
        double hasil;
        int pilih = cmbOperasi.getSelectedIndex();
        switch(pilih) {
            case 0:
                hasil = bilangan1 + bilangan2;
                txtHasil.setText(String.valueOf(hasil));
            break;
            case 1:
                hasil = bilangan1 - bilangan2;
                txtHasil.setText(String.valueOf(hasil));
            break;
            case 2:
                hasil = bilangan1 * bilangan2;
                txtHasil.setText(String.valueOf(hasil));
            break;
            case 3:
                hasil = bilangan1 / bilangan2;
                txtHasil.setText(String.valueOf(hasil));
            break;
        }
    }//GEN-LAST:event_btnHitungMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        // mereset nilai kedalam default
        
        txtBilangan1.setText("");
        txtBilangan2.setText("");
        txtHasil.setText("");
    }//GEN-LAST:event_btnClearMouseClicked

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHitung;
    private javax.swing.JComboBox<String> cmbOperasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBilangan1;
    private javax.swing.JTextField txtBilangan2;
    private javax.swing.JTextArea txtHasil;
    // End of variables declaration//GEN-END:variables
}