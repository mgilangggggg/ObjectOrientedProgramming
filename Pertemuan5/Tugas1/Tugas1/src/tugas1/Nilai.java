package tugas1;

public class Nilai {
    //Deklarasi Atribut Dari Class Nilai, digunakan untuk menampung nilai mahasiswa
    private int nilaiTugas;
    private int nilaiUTS;
    private int nilaiUAS;
    private double nilaiAkhir;
    
    //Construktor -> untuk melakukan inisialisasi nilai mahasiswa ketika object dibuat
    public Nilai (int nilaiTugas, int nilaiUTS, int nilaiUAS ){
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    
    //Deklarasi Getter & Setter
    public int getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(int nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public int getNilaiUTS() {
        return nilaiUTS;
    }

    public void setNilaiUTS(int nilaiUTS) {
        this.nilaiUTS = nilaiUTS;
    }

    public int getNilaiUAS() {
        return nilaiUAS;
    }

    public void setNilaiUAS(int nilaiUAS) {
        this.nilaiUAS = nilaiUAS;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public void setNilaiAkhir(double nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }
    
    //Deklarasi Method dari Class Nilai
    
    //Method hitungNilaiAkhir digunakan untuk mendapatkan nilai akhir mahasiswa
    public double hitungNilaiAkhir(Nilai mahasiswa){
        double na = (0.3*mahasiswa.nilaiTugas) + (0.3*mahasiswa.nilaiUTS) +(0.4*mahasiswa.nilaiUAS);
        return na ;
    }
    
    //Method indeks digunakan untuk mendapatkan indeks akhir mahasiswa
    public char indeks(double nilaiAkhir){
        
        char indeks;
        if(nilaiAkhir >=80 && nilaiAkhir <=100){
            indeks = 'A';
        } else if(nilaiAkhir >= 65 && nilaiAkhir < 80){
            indeks = 'B';
        } else if(nilaiAkhir >= 45 && nilaiAkhir < 65){
            indeks = 'C';
        } else if(nilaiAkhir >= 30 && nilaiAkhir < 45){
            indeks = 'D';
        } else {
            indeks = 'E';
        }
        
        return indeks;
    }
    
}
