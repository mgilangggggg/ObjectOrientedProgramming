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
public class Praktikum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tipe Data Bilangan
        byte iniByte = 127;
        short iniShort = 10000;
        int iniInteger = 1000000000;
        long iniLong = 100000000000L;
        
        // Tipe Data Pecahan
        float iniFloat = 3.142828F;
        double iniDouble = 3.142828;
        
        // Tipe Data Char
        char iniChar = 'A';
        char iniChar2 = 'B';
        char iniChar3 = 'C';
        
        // Tipe Data Boolean
        boolean iniBenar = true;
        boolean iniSalah = false;
        
        // Tipe Data String
        String iniString = "Muhamad Gilang Abdul Gani";
        String iniString2 = "Kelas IF-5";
        
        // Mendeklarasikan variable
        int namaVariable;
        
        namaVariable = 100;
        
        //Mencetak nilai didalam variable
        System.out.println("Ini Adalah Tipe Data Byte    : \t" +iniByte);
        System.out.println("Ini Adalah Tipe Data Short   : \t" +iniShort);
        System.out.println("Ini Adalah Tipe Data Integer : \t" +iniInteger);
        System.out.println("Ini Adalah Tipe Data Long    : \t" +iniLong);
               
        //Mendefinisikan Konstanta
        final double PHI = 3.14;
        System.out.println("Ini Adalah Konstanta PHI     : \t" +PHI);
        
        System.out.println(iniFloat);
        System.out.println(iniDouble);

        System.out.println(iniChar);
        System.out.println(iniChar2);
        System.out.println(iniChar3);

        System.out.println(iniBenar);
        System.out.println(iniSalah);

        System.out.println(iniString);
        System.out.println(iniString2);        
    }
    
}
