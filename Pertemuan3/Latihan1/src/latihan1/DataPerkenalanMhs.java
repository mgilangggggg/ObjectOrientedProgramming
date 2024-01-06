
package latihan1;

/**
 *
 * @author Gilang
 */
public class DataPerkenalanMhs {
    
    
    public static void main(String[] args) {
        
        System.out.println("Tampil Data Mahasiswa ke-1");
        DataMahasiswa mhs1 = new DataMahasiswa();
        mhs1.nama = "Muhamad Gilang Abdul Gani";
        mhs1.nim = 10121177;
        mhs1.kelas = "IF-5";
        mhs1.prodi = "Teknik Informatika";
        mhs1.angkatan = 2021;
        
        mhs1.tampilData();
        System.out.println("");
        
        System.out.println("Tampil Data Mahasiswa ke-2");
        DataMahasiswa mhs2 = new DataMahasiswa();
        mhs2.nama = "Muhamad Gilang";
        mhs2.nim = 10122255;
        mhs2.kelas = "IF-6";
        mhs2.prodi = "Sistem Informasi";
        mhs2.angkatan = 2022;
        
        mhs2.tampilData();
        System.out.println("");
    }
}
