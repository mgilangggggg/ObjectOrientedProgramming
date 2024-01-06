/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author Gilang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Button btnSimpan = new ButtonSimpan();
        Event btnEvent = new ButtonSimpan();
        
        btnSimpan.viewButton();
        btnEvent.isClicked();
    }
    
}
