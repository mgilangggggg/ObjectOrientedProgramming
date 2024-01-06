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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Deklarasi Object dari masing - masing Class
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal duck = new Duck();
        
        //Panggil Method sound dari masing - masing Object
        animal.sound();
        dog.sound();
        cat.sound();
        duck.sound();
    }
    
}
