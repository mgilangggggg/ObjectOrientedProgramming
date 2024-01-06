package praktikum;

public class Operator {
    
    public static void main(String[] args) {
        
        //Coba Operator Aritmatika
        int bilanganA = 10;
        int bilanganB = 5;
        
        int penjumlahan = bilanganA + bilanganB;
        int pengurangan = bilanganA - bilanganB;
        int perkalian = bilanganA * bilanganB;
        double pembagian = bilanganA / bilanganB;
        
        System.out.println("Hasil Penjumlahan Bilangan A dan B : " +penjumlahan);
        System.out.println("Hasil Pengurangan Bilangan A dan B : " +pengurangan);
        System.out.println("Hasil Perkalian Bilangan A dan B   : " +perkalian);
        System.out.println("Hasil Pembagian Bilangan B dan A   : " +pembagian);
    }
}
