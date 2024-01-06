
package latihan1;

/**
 *
 * @author Gilang
 */
public class Printer {
    public String nama;
    public int jmlCetak;
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getJmlCetak() {
        return jmlCetak;
    }
    
    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }
    
    public void tampilCetak(String nama, int jmlCetak) {
        System.out.println("Nama Anda   : "+this.nama);
        System.out.println("Hasil Cetak : ");
        for (int i=1; i<=this.jmlCetak; i++) {
            System.out.println(i+". "+this.nama);
        }
    }
}