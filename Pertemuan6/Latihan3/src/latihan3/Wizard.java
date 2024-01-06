/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author Gilang
 */
public class Wizard extends DataMenu{

    public Wizard() {
        super.setNameJob("Wizard");
        super.setWp("Wand");
        super.setHlth(100);
        super.setMgc(200);
        super.setPwr(200);
        super.setDfd(50);
        super.setLvl(1);
    }

    public void showChar() {
        System.out.println("Level Karakter : " + super.getLvl());
        System.out.println("Nama Job       : " + super.getNameJob());
        System.out.println("Weapon Job     : " + super.getWp());
        System.out.println("Health Poin    : " + super.getHlth());
        System.out.println("Magic Poin     : " + super.getMgc());
        System.out.println("Power          : " + super.getPwr());
        System.out.println("Defend         : " + super.getDfd());
        System.out.println("Hero menyerang musuh menggunakan " + super.getWp() + " dengan Power " + super.getPwr());
    }

}
