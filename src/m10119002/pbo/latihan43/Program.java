/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan43;


/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program gaji pegawai
 * (OBJECT ORIENTED)
 * 
 */
public class Program {
    public static void main(String[] args) {
        GajiPegawai gaPeg = new GajiPegawai();
        gaPeg.setNama("Rizki Adam Kurniawan");
        gaPeg.setAlamat("Jalan Semar dlm 4 No 72/66");
        gaPeg.setUangTransport(250000);
        gaPeg.setUangTunjangan(300000);
        gaPeg.setGajiPokok(4500000);
        gaPeg.setTotalGaji(
                gaPeg.totalGaji(
                        gaPeg.getUangTunjangan(), 
                        gaPeg.getUangTransport(), 
                        gaPeg.getGajiPokok()));
        
        gaPeg.tampilData(
                gaPeg.getNama(), 
                gaPeg.getAlamat(), 
                gaPeg.getUangTunjangan(), 
                gaPeg.getUangTransport(), 
                gaPeg.getGajiPokok(), 
                gaPeg.getTotalGaji());
    }
}
