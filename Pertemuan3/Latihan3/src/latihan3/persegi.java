
package latihan3;

/**
 *
 * @author Gilang
 */
public class persegi {
    double sisi, keliling, luas;
    
    void tampilPersegi(){
        keliling = 4 * this.sisi;
        luas = this.sisi * this.sisi;
        System.out.println("Keliling Persegi : "+this.keliling);
        System.out.println("Luas Persegi     : "+this.luas);
    }
}
