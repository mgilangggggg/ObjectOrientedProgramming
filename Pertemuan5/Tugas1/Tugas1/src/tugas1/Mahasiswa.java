package tugas1;
import java.util.Scanner;

public class Mahasiswa {
    //Deklarasi Atribut dari Class Mahasiswa
    private String nama;
    private String nim;
    private String kelas;
    private final String prodi;
    private Nilai nilai;
    
    //Construktor untuk mengisi nilai Prodi
    public Mahasiswa(String prodi){
        this.prodi = prodi;
    }
    
    //Method Getter & Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getProdi() {
        return prodi;
    }

    public Nilai getNilai() {
        return nilai;
    }

    public void setNilai(Nilai nilai) {
        this.nilai = nilai;
    }
    
    //Deklarasi Method dari class Mahasiswa
    public void tambahDataMahasiswa(){
        Scanner inputMhs = new Scanner(System.in);     
        System.out.print("Nama Mahasiswa    : " );
        this.setNama(inputMhs.nextLine());
        System.out.print("NIM Mahasiswa     : " );
        this.setNim(inputMhs.nextLine());
        System.out.print("Kelas Mahasiswa   : " );
        this.setKelas(inputMhs.nextLine()); 
        
    
    }
    
    public void tambahDataNilai(){
        Scanner inputNilai = new Scanner(System.in);   
        System.out.print("Input Nilai Tugas : " );
        int nilai1 = inputNilai.nextInt();
        System.out.print("Input Nilai  UTS  : " );
        int nilai2 = inputNilai.nextInt();
        System.out.print("Input Nilai UAS   : " );
        int nilai3 = inputNilai.nextInt();
        
        this.setNilai(new Nilai(nilai1, nilai2, nilai3)); 
         
    }
    
    public void tampilDataMahasiswa(){
        System.out.println("Nama Mahasiswa   :" +this.getNama());
        System.out.println("NIM Mahasiswa    :" +this.getNim());
        System.out.println("Kelas            :" +this.getKelas());
        System.out.println("Program Studi    :" +this.getProdi());
        System.out.println("Nilai Tugas      : "+this.getNilai().getNilaiTugas());
        System.out.println("Nilai UTS        : "+this.getNilai().getNilaiUTS());
        System.out.println("Nilai UAS        : "+this.getNilai().getNilaiUAS());
        this.cetakIndeks();
        
    }
    
     public void cetakIndeks(){
        this.getNilai().setNilaiAkhir(this.getNilai().hitungNilaiAkhir(nilai));
        char indeks = this.getNilai().indeks(this.getNilai().getNilaiAkhir());
        System.out.println("Tampil Nilai Akhir  : " +this.getNilai().getNilaiAkhir());
        System.out.println("Tampil Indeks Nilai : " +indeks);
        
    }
         
}
