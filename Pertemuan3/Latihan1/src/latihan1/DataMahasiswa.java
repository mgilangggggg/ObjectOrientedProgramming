
package latihan1;

/**
 *
 * @author Gilang
 */
public class DataMahasiswa {
    String nama, kelas, prodi;
    int nim, angkatan;
    final String UNIVERSITAS = "UNIKOM";
    
    
    void tampilData(){
        
        System.out.println("Nama Mahasiswa : " +this.nama);
        System.out.println("NIM Mahasiswa  : " +this.nim);
        System.out.println("Kelas          : " +this.kelas);
        System.out.println("Program Studi  : " +this.prodi);
        System.out.println("Angkatan       : " +this.angkatan);
        System.out.println("Universitas    : " +this.UNIVERSITAS);
    }
}
