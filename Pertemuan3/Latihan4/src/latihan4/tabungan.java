
package latihan4;

/**
 *
 * @author Gilang
 */
public class tabungan {
    int saldo, i;
    double bunga;
    
    void tampilTabungan(){
        while(saldo <= 2000000){
            i+=1;
            double diskon = saldo * bunga;
            saldo+=diskon;
            System.out.println("Saldo di bukan ke-" +i+ " : " + "Rp. " + saldo);
        }
    }  
}
