/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts1ganjil;

import java.util.Scanner;

/**
 *
 * @author Gilang
 */
public class Gilang {

    /**
     * Nim : 10121177
     * Nama : Muhamad Gilang Abdul Gani
     * Kelas : IF-5
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Pegawai pegawai = new Pegawai();
        PegawaiTetap pegawaiTetap = new PegawaiTetap();
        PegawaiHonor pegawaiHonor = new PegawaiHonor();
        
        System.out.println("PROGRAM MENGHITUN GAJI PEGAWAI PT.CENAT-CENUT");
        System.out.println("=================================================");
        System.out.print("Masukan Status Pegawai [TETAP/HONOR] : ");
        pegawai.setCekStatusPegawai(input.next());
        
                
        switch (pegawai.getCekStatusPegawai()) {
            case "TETAP":
                System.out.println("MASUKAN DATA PEGAWAI TETAP");
                System.out.println("=========================================");
                System.out.print("Masukan NIP Pegawai : ");
                pegawaiTetap.setNip(input.nextInt());
                System.out.print("Masukan Nama Pegawai : ");
                pegawaiTetap.setNama(input.next());
                System.out.print("Masukan Alamat Pegawai : ");
                pegawaiTetap.setAlamat(input.next());
                System.out.print("Masukan Lama Kerja Pegawai : ");
                pegawaiTetap.setLamaKerja(input.nextInt());
                System.out.print("Masukan Jumlah Anak : ");
                pegawaiTetap.setJumlahAnak(input.nextInt());
                
                pegawaiTetap.tampilDataPegawaiTetap();
                break;
            case "HONOR":
                System.out.println("MASUKAN DATA PEGAWAI HONOR");
                System.out.println("=========================================");
                System.out.print("Masukan Nama Pegawai : ");
                pegawaiHonor.setNama(input.next());
                System.out.print("Masukan Alamat Pegawai : ");
                pegawaiHonor.setAlamat(input.next());
                System.out.print("Masukan Jumlah Hari Kerja Pegawai : ");
                pegawaiHonor.setLamaKerja(input.nextInt());
                break;
                default:
                break;
        }
    }
    
}
