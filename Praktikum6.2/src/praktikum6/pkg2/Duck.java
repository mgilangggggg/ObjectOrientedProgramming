/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6.pkg2;

/**
 *
 * @author Gilang
 */
public class Duck extends Animal {
    
    public Duck() {
        super.setNama("DUCK");
    }
    
    @Override
    public void sound() {
        System.out.println(super.getNama()+" Bersuara QUACK QUACk");
        System.out.println("");
    }
}
