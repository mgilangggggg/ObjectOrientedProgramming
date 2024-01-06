/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobautsganjil;
import java.util.Scanner;
/**
 *
 * @author Gilang
 */
public class pegawaiTetap extends pegawai{
    
    private String nip;
    private int lamaKerja;
    private int jmlhAnak;
    private int tunjanganAnak;
    private int TunjanganTransportasi;
    
    public pegawaiTetap(String status) {
        super.setStatus(status);
        this.tunjanganAnak = 800000;
        this.TunjanganTransportasi = 370000;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    public int getJmlhAnak() {
        return jmlhAnak;
    }

    public void setJmlhAnak(int jmlhAnak) {
        this.jmlhAnak = jmlhAnak;
    }

    public int getTunjanganAnak() {
        return tunjanganAnak;
    }

    public void setTunjanganAnak(int tunjanganAnak) {
        this.tunjanganAnak = tunjanganAnak;
    }

    public int getTunjanganTransportasi() {
        return TunjanganTransportasi;
    }

    public void setTunjanganTransportasi(int TunjanganTransportasi) {
        this.TunjanganTransportasi = TunjanganTransportasi;
    }
    
    public int hitungGajiPokok() {
        int gajiPokok = 0;
        if (this.lamaKerja <= 5) {
            gajiPokok = 2_500_000;
        } else if (this.lamaKerja <= 10) {
            gajiPokok = 5_700_000;
        } else if (this.lamaKerja <= 20) {
            gajiPokok = 6_500_000;
        } else {
            gajiPokok = 10_000_000;
        }
        
        return gajiPokok;
    }
    
    @Override
    public double hitungGajiPegawai() {
        double totalGaji;
        totalGaji = this.hitungGajiPokok() + this.tunjanganAnak + this.TunjanganTransportasi;
        return 0;
    }
    
    @Override
    public void tambahDataPegawai() {
        Scanner inputData = new Scanner(System.in);
        
        System.out.println("MASUKAN DATA PEGAWAI TETAP");
        System.out.println("==========================");
        System.out.println("");
        System.out.print("Masukan NIP Pegawai : ");
        this.setNip(inputData.nextLine());
        System.out.print("Masukan Nama Pegawai : ");
        super.setNama(inputData.nextLine());
        System.out.print("Alamat Pegawai : ");
        super.setAlamat(inputData.nextLine());
        System.out.print("Lama Kerja : ");
        this.setLamaKerja(inputData.nextInt());
        System.out.print("Jumlah Anak : ");
        this.setJmlhAnak(inputData.nextInt());
        
    }
    
    @Override
    public void tampilDataPegawai() {
        System.out.println("TAMPIL DATA GAJI PEGAWAI TETAP");
        System.out.println("==============================");
        System.out.println("");
        System.out.println("NIP Pegawai : " + this.nip);
        super.tampilDataPegawai();
        System.out.println("Total Gaji Pegawai : " + this.hitungGajiPegawai());
        System.out.println("");
        System.out.println("Rincian Gaji Pegawai");
        System.out.println("Lama Kerja Pegawai : "+ this.lamaKerja);
        System.out.println("Jumlah Anak : " + this.jmlhAnak);
        System.out.println("Gaji Pokok : " + this.hitungGajiPokok());
        System.out.println("Tunjangan Anak : " + this.tunjanganAnak);
        System.out.println("Tunjangan Transportasi : " + this.TunjanganTransportasi);
        
    }
}
