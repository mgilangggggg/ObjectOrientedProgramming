package TugasBesar.MVC.pbo.model;

import TugasBesar.MVC.pbo.controller.InventarisController;
import TugasBesar.MVC.pbo.event.InventarisListener;
import TugasBesar.MVC.pbo.view.DashboardView;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class InventarisModel {
    
    // Inisialisasi Variable Untuk Semua Data Yang Dibutuhkan
    private String kodeBarang;
    private String namaBarang;
    private String supplier;
    private String tgl;
    private String bulan;
    private String tahun;
    
    private String tglExpired;
    private String bulanExpired;
    private String tahunExpired;
    
    
    private InventarisListener inventarisListener;
    
    private Calendar cal = Calendar.getInstance();
    
    // Inisalisasi Variable Untuk Mendapatkan Data Tanggal, Bulan dan Tahun
    private int tglSekarang = cal.get(cal.DATE);
    private int bulanSekarang = cal.get(cal.MONTH);
    private int tahunSekarang = cal.get(cal.YEAR);
    
    
    // Deklarasi Method Get & Set
    public String getKodeBarang() {
        return kodeBarang;
    }
    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
        fireOnChange();
    }

    public String getNamaBarang() {
        return namaBarang;
    }
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
        fireOnChange();
    }

    public String getSupplier() {
        return supplier;
    }
    public void setSupplier(String supplier) {
        this.supplier = supplier;
        fireOnChange();
    }

    public String getTglExpired() {
        return tglExpired;
    }
    public void setTglExpired(String tglExpired) {
        this.tglExpired = tglExpired;
        fireOnChange();
    }
    
    public InventarisListener getInventarisListener() {
        return inventarisListener;
    }

    public void setInventarisListener(InventarisListener inventarisListener) {
        this.inventarisListener = inventarisListener;
    }
    
    
    
    // Method Untuk Menerima Inputan Dari User
    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
        fireOnChange();
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
        fireOnChange();
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
        fireOnChange();
    }

    public String getBulanExpired() {
        return bulanExpired;
    }

    public void setBulanExpired(String bulanExpired) {
        this.bulanExpired = bulanExpired;
        fireOnChange();
    }

    public String getTahunExpired() {
        return tahunExpired;
    }

    public void setTahunExpired(String tahunExpired) {
        this.tahunExpired = tahunExpired;
        fireOnChange();
    }
    
    
    // Method Get Untuk Mengambil Data Tanggal, Bulan dan Tahun
    public int getTglSekarang() {
        return tglSekarang;
    }

    public int getBulanSekarang() {
        return bulanSekarang;
    }

    public int getTahunSekarang() {
        return tahunSekarang;
    }
    protected void fireOnChange() {
        // Validasi jika object pelangganListener tidak kosong
        if(inventarisListener != null) {
            inventarisListener.onChange(this);
        }
    }
  
    // Deklarasi Method Semua Aksi Pada Menu
    public void SimpanData() {
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    
    public void HapusData() {
    
    }
    
    public void TampilData() {
    
    }
    
    public void EditData() {
    
    }
    
    public void ResetForm() {
        this.setKodeBarang("");
        this.setNamaBarang("");
        this.setSupplier("");
        this.setTgl("");
        this.setBulan("");
        this.setTahun("");
        this.setTglExpired("");
        this.setBulanExpired("");
        this.setTahunExpired("");
    }
}
