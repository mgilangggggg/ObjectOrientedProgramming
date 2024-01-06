
package Praktik1.apps;

/**
 *
 * @author Gilang
 */
public class Kotak {
    
    int panjang;
    int lebar;
    
    Kotak(){
        
    }
    
    Kotak(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    Kotak(Kotak persegi){
        this.panjang = persegi.panjang;
        this.lebar = persegi.lebar;
    }
    
    void tampilDataKotak(){
        System.out.println("Panjang dari kotak adalah "+this.panjang);
        System.out.println("Panjang dari kotak adalah "+this.lebar);
    }
}
