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
public class DataMenu {
    private String name;
    private String namejob;
    private String wp;
    private int hlth;
    private int mgc;
    private int pwr;
    private int dfd;
    private int lvl;

    public DataMenu() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameJob() {
        return namejob;
    }

    public void setNameJob(String namejob) {
        this.namejob = namejob;
    }

    public String getWp() {
        return wp;
    }

    public void setWp(String wp) {
        this.wp = wp;
    }

    public int getHlth() {
        return hlth;
    }

    public void setHlth(int hlth) {
        this.hlth = hlth;
    }

    public int getMgc() {
        return mgc;
    }

    public void setMgc(int mgc) {
        this.mgc = mgc;
    }

    public int getPwr() {
        return pwr;
    }

    public void setPwr(int pwr) {
        this.pwr = pwr;
    }

    public int getDfd() {
        return dfd;
    }

    public void setDfd(int dfd) {
        this.dfd = dfd;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void showName() {
        System.out.println("TAMPIL STATUS HERO");
        System.out.println("==========================");
        System.out.println("Nama Karakter  : " + this.name);
    }
}
