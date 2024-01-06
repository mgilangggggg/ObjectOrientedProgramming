
package latihan3;

/**
 *
 * @author Gilang
 */
class lingkaran {
    double jari_jari;
    double PHI;
    double keliling;
    double luas;
    
    void tampilLingkaran(){
        keliling = 2 * PHI * jari_jari;
        luas = PHI * jari_jari * jari_jari;
        System.out.println("Keliling Lingkaran : "+this.keliling);
        System.out.println("Luas Lingkaran     : "+this.luas);
    }
}
