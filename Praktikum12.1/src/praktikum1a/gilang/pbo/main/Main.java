/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum1a.gilang.pbo.main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Gilang
 */
public class Main {
    
    public static void main (String[] args) {
        
        // Deklarasi object dari Class JFrame
        JFrame frame = new JFrame(); // buat object
        frame.setSize(900, 760);       
        frame.setLayout(null);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setSize(900, 520);
        mainPanel.setBackground(Color.yellow);
        mainPanel.setLayout(null);
        mainPanel.setBounds(0, 200 ,900, 520);
        
        frame.add(mainPanel);
        
        JLabel label1 = new JLabel();
        label1.setText("Belajar GUI Dengan JAVA Swing");
        label1.setBounds(100, 75, 600, 50);
        label1.setFont(new Font("tahoma",1, 36));
        
        frame.add(label1);
        
        JTextField txtField1 = new JTextField();
        txtField1.setBounds(250, 150, 500, 50);
        
        mainPanel.add(txtField1);
        
        JButton button1;
        button1 = new JButton();
        button1.setText("TAMPIL");
        button1.setBounds(350, 250, 150 ,40);
        button1.setFont(new Font("tahoma",1, 16));
        
        mainPanel.add(button1);
                
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set button close
        frame.setVisible(true); // set frame supaya terlihat
        
    }
}