/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;
import java.util.Scanner;
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
        
        Scanner inName = new Scanner(System.in);
        Scanner inMenu = new Scanner(System.in);
        String PilihMenu;

        System.out.println("CREATE CHARACTER GAME ANDA");
        System.out.println("==========================");

        DataMenu Name = new DataMenu();

        System.out.print("Masukkan Nama Character Anda : ");
        Name.setName(inName.nextLine());
        System.out.println("[1] KNIGHT");
        System.out.println("[2] ARCHER");
        System.out.println("[3] WIZARD");
        System.out.print("PILIH JOB [1/2/3] : ");
        PilihMenu = inMenu.next();
        
        switch (PilihMenu) {
            case "1" :
                Knight knight = new Knight();
                System.out.println("");
                Name.showName();
                knight.showChar();
                break;

            case "2" :
                Archer archer = new Archer();
                System.out.println("");
                Name.showName();
                archer.showChar();
                break;

            case "3" :
                Wizard wizard = new Wizard();
                System.out.println("");
                Name.showName();
                wizard.showChar();
                default:
        }
    } 
}
