/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author Gilang
 */
public class Perulangan {
    public static void main(String[] args){
        
        //Mancoba Perulangan FOR
        
        String keterangan = "Saya Sedang Belajar Perulangan FOR";
        
        for (int i = 1; i <= 10; i++){
            //Badan Perulangan
            System.out.println(keterangan +" ke-"+i);
        }
        
        //Mencoba Perulangan While
        
        String keterangan2 = "Saya Sedang Belajar Perulangan While";
        int counter;
        counter = 1;
        
        while(counter <= 10){
            //Badan Perulangan while
            System.out.println(keterangan2+ " ke-" +counter);
            counter++;
        }
    }
}
