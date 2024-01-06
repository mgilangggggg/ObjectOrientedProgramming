
package latihan3;

/**
 *
 * @author Gilang
 */
class persegiPjg {
    double panjang, lebar, keliling, luas;
    
    void tampilPersegiPjg(){
        keliling = 2 * (panjang + lebar);
        luas = panjang * lebar;
        System.out.println("Keliling Persegi Panjang : "+this.keliling);
        System.out.println("Luas Persegi Panjang     : "+this.luas);
    }
}