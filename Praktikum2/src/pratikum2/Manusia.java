
package pratikum2;

/**
 *
 * @author Gilang
 */
public class Manusia {
    //Isi dari class
    String nama;
    String alamat;
    int umur;
    final String negara = "Indonesia";
    
    //Membuat contructor
    Manusia(String paramNama){
    //Ini Constructor
        nama = paramNama;
    }
    
    void tampilBiodata(){
        //Block dari method
        System.out.println("Nama Saya   : " +this.nama);
        System.out.println("Alamat      : " +this.alamat);
        System.out.println("Umur        : " +this.umur);
        System.out.println("Negara Asal : " +this.negara);
    }
    
    String sayHello(String nama){
        String salam = "Halo "+nama+" Nama Saya " +this.nama; 
        return(salam);
    }
    
}
