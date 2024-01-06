package latihan2;

/**
 *
 * @author Gilang
 */
public class Age {
   public int tahunLahir;
   public int tahunSkrng;
   public int umur;
   public int hitungUmur;
   public String keterangan;
    
    public int getTahunLahir() {
        return tahunLahir;
    }
    
    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }
    
    public int getTahunSkrng() {
        return tahunSkrng;
    }
    
    public void setTahunSkrng(int tahunSkrng) {
        this.tahunSkrng = tahunSkrng;
    }

    public void hitungUmur(int tahunLahir, int tahunSkrn) {
        System.out.println("Tahun Lahir Anda    : " +this.tahunLahir);
        System.out.println("Hari ini Tahun      : " +this.tahunSkrng);
        umur = tahunSkrng - tahunLahir;
        System.out.println("Umur kamu saat ini  : " +umur+ " Tahun");
        
        if(umur >= 0 && umur <= 5) {
            this.keterangan = "LAGI LUCU-LUCUNYA";
            System.out.println("TANDANYA KAMU\t    : " +this.keterangan);
        }
        else if((umur > 5) && (umur <= 10)) {
            this.keterangan = "MASIH ANAK-ANAK";
            System.out.println("TANDANYA KAMU\t    : " +this.keterangan);
        }
        else if((umur > 10) && (umur <= 13)) {
            this.keterangan = "MASIH REMAJA";
            System.out.println("TANDANYA KAMU\t    : " +this.keterangan);
        }
        else if((umur > 13) && (umur <= 19)) {
            this.keterangan = "ALAY";
            System.out.println("TANDANYA KAMU\t    : " +this.keterangan);
        }
        else if((umur > 19) && (umur <= 29)) {
            this.keterangan = "LAGI GALAU NYARI JODOH";
            System.out.println("TANDANYA KAMU\t    : " +this.keterangan);
        }
        else if((umur > 29) && (umur <= 35)) {
            this.keterangan = "LAGI SIBUK NYARI UANG";
            System.out.println("TANDANYA KAMU\t    : " +this.keterangan);
        }
        else if((umur > 35) && (umur <= 150)) {
            this.keterangan = "SUDAH TUA";
            System.out.println("TANDANYA KAMU\t    : " +this.keterangan);
        }
        else {
            this.keterangan = "TIDAK TERSETEKSI DI KEHIDUPAN";
            System.out.println("TANDANYA KAMU\t    : " +this.keterangan);
        }
    }
}