package TugasBesar.MVC.pbo.controller;

import TugasBesar.MVC.pbo.model.InventarisModel;
import TugasBesar.MVC.pbo.view.DashboardView;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InventarisController {
    
    private InventarisModel model;
    private DefaultTableModel tabmode;

    public InventarisModel getModel() {
        return model;
    }
    public void setModel(InventarisModel model) {
        this.model = model;
    }
    
    
    public void TampilData(DashboardView view) {
        Object[] title = {"Kode Barang", "Nama Barang", "Perusahaan Produksi","Jumlah Barang" , "Tanggal Masuk", "Expired", "Keterangan"};
        tabmode = new DefaultTableModel(null, title);
        view.getJTableData().setModel(tabmode);
        String sql = "select * from databarang";
        try {
            Connection koneksi = new Koneksi().getConnection();
            Statement stat = koneksi.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()) {
                // Proses Pemencahan Data Tanggal Expired
                String expired = hasil.getString("tglExpired");
                String[] hasilSplitExpired = expired.split("-");
                int tgl = Integer.valueOf(hasilSplitExpired[0]);
                int bln = Integer.valueOf(hasilSplitExpired[1]);
                int thn = Integer.valueOf(hasilSplitExpired[2]);
                
                // Proses Untuk Mendapatkan Jarak Antara Data Tanggal Expired Dengan Tanggal Sekarang
                int hasilTgl = tgl - model.getTglSekarang();
                int hasilBulan = bln - (model.getBulanSekarang() + 1);
                int hasilTahun = thn - model.getTahunSekarang();
                
                // Konveri Data Bulan dan Tahun
                int konversiBulan = hasilBulan * 30;
                int konversiTahun = hasilTahun * 360;
                
                // Jarak Hari Expired Dengan Tanggal Sekarang
                int gapExpired = hasilTgl + konversiBulan + konversiTahun;
                
                String kodeBrg = hasil.getString("kodeBarang");
                String namaBrg = hasil.getString("namaBarang");
                String supplier = hasil.getString("perusahaanProduksi");
                String jlmBrg = hasil.getString("jumlahBarang");
                String tglMasuk = hasil.getString("tglMasuk");
                String tglExpired = hasil.getString("tglExpired");
                if(gapExpired <= 0 ) {
                    String keterangan = "Expired";
                    String[] dataRow = {kodeBrg, namaBrg, supplier, jlmBrg, tglMasuk, tglExpired, keterangan};
                    tabmode.addRow(dataRow);
                } else {
                    String keterangan = String.valueOf(gapExpired) + " Hari";
                    String[] dataRow = {kodeBrg, namaBrg, supplier, jlmBrg, tglMasuk, tglExpired, keterangan};
                    tabmode.addRow(dataRow);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan Data Gagal");
        }
    }
    
    public void TambahData(DashboardView view) {
        String kode = view.getTxtKodeBarang().getText().toUpperCase();
        String nama = view.getTxtNamaBarang().getText().toUpperCase();
        String supplier = view.getTxtSupplier().getText().toUpperCase();
        String jlmBrg = view.getTxtJlmBarang().getText();
        String tglMasuk = view.getTxtTglMasuk().getText();
        String blnMasuk = view.getTxtBulanMasuk().getText();
        String thnMasuk = view.getTxtTglMasuk().getText();
        String tglExpired = view.getTxtTglExpired().getText();
        String blnExpired = view.getTxtBulanExpired().getText();
        String thnExpired = view.getTxtTahunExpired().getText();
        
        String expired = tglExpired +"-"+ blnExpired+ "-" +thnExpired;
        String tglMasukBarang = tglMasuk +"-"+ blnMasuk+ "-" + thnMasuk;
        String sql = "insert into databarang values('"+kode+"','"+nama+"','"+supplier+"','"+tglMasukBarang+"','"+expired+"')";
        if("".equals(kode)) {
            JOptionPane.showMessageDialog(null, "Data Kode Barang Tidak Boleh Kosong");
        }else if("".equals(nama)) {
            JOptionPane.showMessageDialog(null, "Data Nama Barang Tidak Boleh Kosong");
        }else if("".equals(supplier)) {
            JOptionPane.showMessageDialog(null, "Data Supplier Barang Tidak Boleh Kosong");
        }else if("".equals(jlmBrg)) {
            JOptionPane.showMessageDialog(null, "Data Jumlah Barang Tidak Boleh Kosong");
        }else if("".equals(tglMasuk)) {
            JOptionPane.showMessageDialog(null, "Data Tanggal Masuk Barang Tidak Boleh Kosong");
        }else if("".equals(expired)) {
            JOptionPane.showMessageDialog(null, "Data Expired Barang Tidak Boleh Kosong");
        } else {
            try {
                Connection konek = new Koneksi().getConnection();
                Statement stat = konek.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
                TampilData(view);
                model.setKodeBarang(kode);
                model.setNamaBarang(nama);
                model.setSupplier(supplier);
                model.setTgl(tglMasuk);
                model.setBulan(blnMasuk);
                model.setTahun(thnMasuk);
                model.setTglExpired(tglExpired);
                model.setBulanExpired(blnExpired);
                model.setTahunExpired(thnExpired);
                ResetForm(view);
                konek.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Gagal Menambahkan Data", "infomasil", JOptionPane.INFORMATION_MESSAGE);
            }
        } 
    }
    
    public void klikData(DashboardView view) {
        try {
            Connection konek = new Koneksi().getConnection();
            int row = view.getJTableData().getSelectedRow();
            String table_klik = (view.getJTableData().getModel().getValueAt(row, 0).toString());
            String sql = "select * from databarang where kodeBarang = '"+table_klik+"'";
            Statement stat = konek.createStatement();
            ResultSet data = stat.executeQuery(sql);
            
            if(data.next()) {
                // Pengisian textFeild ketika sebuah data diklik
                String kodeBarang = data.getString("kodeBarang");
                view.getTxtKodeBarang().setText(kodeBarang);
                view.getTxtKodeBarang().setEditable(false);
                
                String namaBarang = data.getString("namaBarang");
                view.getTxtNamaBarang().setText(namaBarang);
                
                String supplier = data.getString("perusahaanProduksi");
                view.getTxtSupplier().setText(supplier);
                
                String jlmBrg = data.getString("jumlahBarang");
                view.getTxtJlmBarang().setText(jlmBrg);
                
                
                // Proses Pemecahan Data Tanggal Masuk Barang
                String TglMasukBarang = data.getString("tglMasuk");
                String[] hasilSpiltMasuk = TglMasukBarang.split("-");
                String tglMasuk = hasilSpiltMasuk[0];
                String blnMasuk = hasilSpiltMasuk[1];
                String thnMasuk = hasilSpiltMasuk[2];
                
                view.getTxtTglMasuk().setText(tglMasuk);
                view.getTxtBulanMasuk().setText(blnMasuk);
                view.getTxtTahunMasuk().setText(thnMasuk);
                
                
                // Proses Pemencahan Data Tanggal Expired
                String expired = data.getString("tglExpired");
                String[] hasilSplitExpired = expired.split("-");
                String tgl = hasilSplitExpired[0];
                String bln = hasilSplitExpired[1];
                String thn = hasilSplitExpired[2];
                
                view.getTxtTglExpired().setText(tgl);
                view.getTxtBulanExpired().setText(bln);
                view.getTxtTahunExpired().setText(thn);
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void editData(DashboardView view) {
        String kodebrg = view.getTxtKodeBarang().getText();
        String namaBarang = view.getTxtNamaBarang().getText();
        String supplier = view.getTxtSupplier().getText();
        String jumlahBrg = view.getTxtJlmBarang().getText();
        
        // Proses Penyatuan Data Tanggal Masuk Barang
        String tglMasuk = view.getTxtTglMasuk().getText();
        String blnMasuk = view.getTxtBulanMasuk().getText();
        String thnMasuk = view.getTxtTahunMasuk().getText();
        String DataTglMasuk = tglMasuk+ "-" +blnMasuk+ "-" +thnMasuk;
        
        // Proses Penyatuan Data Tanggal Expired
        String tglExpired = view.getTxtTglExpired().getText();
        String blnExpired = view.getTxtBulanExpired().getText();
        String thnExpired = view.getTxtTahunExpired().getText();
        String DataTglExpired = tglExpired+ "-" +blnExpired+ "-" +thnExpired;
        if("".equals(kodebrg)) {
            JOptionPane.showMessageDialog(null, "Tidak Ada Yang DiUbah");
        } else {
            try {
                Connection koneksi = new Koneksi().getConnection();
                String sql = "update databarang set namaBarang = '"+ namaBarang
                        +"', jumlahBarang = '" +  jumlahBrg
                        +"', perusahaanProduksi = '" + supplier 
                        +"', tglMasuk = '" + DataTglMasuk 
                        +"', tglExpired = '" + DataTglExpired 
                        +"' where kodeBarang = '" + kodebrg +"'";
                Statement stat = koneksi.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
                koneksi.close();
                TampilData(view);
                ResetForm(view);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
                System.out.println(e);
            }
        }
    }
    
    public void hapusData(DashboardView view) {
        try {
            String kodebrg = view.getTxtKodeBarang().getText();
            if(!"".equals(kodebrg)) {
                Connection koneksi = new Koneksi().getConnection();
                String sql = "delete * from databarang where kodeBarang = '"+ kodebrg +"'";
                Statement stat = koneksi.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                koneksi.close();
                ResetForm(view);
                TampilData(view);
            } else {
                JOptionPane.showMessageDialog(null, "Tidak Ada Yang Dihapus");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
    }
    
    public void cariData(DashboardView view) {
        Object[] title = {"Kode Barang", "Nama Barang", "Supplier", "Tanggal Masuk", "Expired"};
        tabmode = new DefaultTableModel(null, title);
        view.getJTableData().setModel(tabmode);
        String inputCari = view.getTxtCari().getText().toUpperCase();
        String sql = "select * from databarang where kodeBarang like '%"+ inputCari 
                +"%' or namaBarang like'%"+ inputCari
                +"%' or perusahaanProduksi like '%" + inputCari + "%'" ;
        try {
            Connection koneksi = new Koneksi().getConnection();
            Statement stat = koneksi.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            
            while(hasil.next()) {
                String kodeBrg = hasil.getString("kodeBarang");
                String namaBrg = hasil.getString("namaBarang");
                String supplier = hasil.getString("perusahaanProduksi");
                String tglMasuk = hasil.getString("tglMasuk");
                String tglExpired = hasil.getString("tglExpired");
                String[] dataRow = {kodeBrg, namaBrg, supplier, tglMasuk, tglExpired};
                tabmode.addRow(dataRow);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan Data Gagal");
        }
    }
    
    
    public void ResetForm(DashboardView view) {
        model.ResetForm();
    }
}