/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author Gilang
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Program Menampilkan Bilangan Genap 1 Sampai Dengan 100
        System.out.println("Menampilkan bilangan genap dari 1 s/d 100");
        System.out.println("====================================");
        
        for (int i = 2; i <= 100; i += 2) {
            if (i % 10 == 0){
                System.out.print(i+ ", \n");
            }else{
                System.out.print(i+ ", ");
            }
            
        }
        
    }
    
}
