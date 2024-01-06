package latihan3;

import java.util.Scanner;

/**
 *
 * @author Gilang
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        BangunDatar menu = new BangunDatar();
        System.out.println("Program Menghitung VOLUME Bangun Ruang");
        System.out.println("======================================");
        System.out.println("1) Volume Balok");
        System.out.println("2) Volume Tabung");
        System.out.println("3) Volume Bola");
        System.out.println("");
        System.out.print("PILIH BANGUN RUANG [1/2/3] : ");
        menu.status = scanner.nextInt();
        System.out.println("");

        switch (menu.status) {
            case 1:
                System.out.println("MENU BALOK");
                System.out.println("Masukan Nilai Panjang, Lebar & Tinggi");
                System.out.println("=====================================");
                System.out.print("Panjang   : ");
                menu.setPanjang(scanner.nextDouble());
                System.out.print("Lebar     : ");
                menu.setLebar(scanner.nextDouble());
                System.out.print("Tinggi    : ");
                menu.setTinggi(scanner.nextDouble());
                System.out.println("");     
                menu.hitungVolume(menu.getPanjang(),menu.getLebar(), menu.getTinggi());
                break;
                
            case 2:
                System.out.println("MENU TABUNG");
                System.out.println("Masukan Nilai Jari - Jari & Tinggi");
                System.out.println("===================================");
                System.out.print("Jari - Jari : ");
                menu.setJariJari(scanner.nextDouble());
                System.out.print("Tinggi\t    : ");
                menu.setTinggi(scanner.nextDouble());
                System.out.println("");
                menu.hitungVolume(menu.getJariJari(), menu.getTinggi());
                break;
                
            case 3:
                System.out.println("MENU BOLA");
                System.out.println("Masukan Nilai Jari - Jari");
                System.out.println("==========================");
                System.out.print("Jari - Jari   : ");
                menu.setJariJari(scanner.nextDouble());
                System.out.println("");
                menu.hitungVolume(menu.getJariJari());
                break;
        }
    }
}