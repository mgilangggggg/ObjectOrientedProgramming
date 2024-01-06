package latihan3;

/**
 *
 * @author Gilang
 */
public class BangunDatar {
    public int status;
    private double panjang, lebar, tinggi, jariJari, volume, phi = 3.14;
    
    BangunDatar(){
        
    }
    
    public void hitungVolume(double p, double l, double t){
        volume = p * l * t;
        System.out.println("Tampil Volume Balok = "+ volume);
    }
    
    public void hitungVolume(double jariJari, double t){
        volume = phi * jariJari * jariJari * tinggi;
        System.out.println("Tampil Volume Tabung = "+ volume);
    }
    
    public void hitungVolume(double jariJari){
        volume = (4 * phi * jariJari * jariJari * jariJari) / 3;
        System.out.println("Tampil Volume Balok = "+ volume);
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
}

