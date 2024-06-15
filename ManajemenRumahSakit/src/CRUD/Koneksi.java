/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class Koneksi {

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String databasename = "rumah_sakit";
    private String username = "root";
    private String password = "new_password";
    private String lokasi = "jdbc:mysql://localhost/"+databasename;
    public static Connection koneksidb;
    
    public Koneksi(){
    
        try {
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksidb = DriverManager.getConnection(lokasi,username,password);
            System.out.println("Database Terkoneksi");
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void ubahPasien(String tempIdPasien, String tempNama, String tempUmur, String tempJenisKelamin, String tempAlamat){
        
        try {
            
            String sql = "update pasien set nama = ?, umur = ?, jeniskelamin =?, alamat = ? where idPasien = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempIdPasien);
            perintah.setString(2, tempNama);
            perintah.setString(3, tempUmur);
            perintah.setString(4, tempJenisKelamin);
            perintah.setString(5, tempAlamat);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void simpanPasien(String tempIdPasien, String tempNama, String tempUmur, String tempJenisKelamin, String tempAlamat){
        
        try {
            
            String sql = "insert into pasien (idPasien, nama, umur, jeniskelamin, alamat) value (?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempIdPasien);
            perintah.setString(2, tempNama);
            perintah.setString(3, tempUmur);
            perintah.setString(4, tempJenisKelamin);
            perintah.setString(5, tempAlamat);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    

    public void hapusPasien(String tempIdPasien){
        
        try {
            
            String sql = "delete from pasien where idPasien = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempIdPasien);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
   
    
public void ubahDokter(String tempIdDokter, String tempNama, String tempSpesialis, String tempTelepon){
        
        try {
            
            String sql = "update dokter set nama = ?, spesialis = ?, telepon = ? where idDokter = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempIdDokter);
            perintah.setString(2, tempNama);
            perintah.setString(3, tempSpesialis);
            perintah.setString(4, tempTelepon);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void simpanDokter(String tempIdDokter, String tempNama, String tempSpesialis, String tempTelepon){
        
        try {
            
            String sql = "insert into pasien (idDokter, nama, spesialis, telepon) value (?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempIdDokter);
            perintah.setString(2, tempNama);
            perintah.setString(3, tempSpesialis);
            perintah.setString(4, tempTelepon);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    

    public void hapusDokter(String tempIdDokter){
        
        try {
            
            String sql = "delete from dokter where idDokter = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempIdDokter);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public void ubahJanjiTemu(String tempIdJanjiTemu, String tempIdPasien, String tempIdDokter, String tempTanggalJanji, String tempStatus){
        
        try {
            String sql = "update janjitemu set idPasien = ?, idDokter = ?, tanggalJanji = ? where idJanjiTemu = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempIdJanjiTemu);
            perintah.setString(2, tempIdPasien);
            perintah.setString(3, tempIdDokter);
            perintah.setString(4, tempTanggalJanji);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void simpanJanjiTemu(String tempIdJanjiTemu, String tempIdPasien, String tempIdDokter, String tempTanggalJanji, String tempStatus){
        
        try {
            
            String sql = "insert into janjitemu (idJanjiTemu, idPasien, idDokter, tanggalJanji, status) value (?,?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempIdJanjiTemu);
            perintah.setString(2, tempIdPasien);
            perintah.setString(3, tempIdDokter);
            perintah.setString(4, tempTanggalJanji);
            perintah.setString(5, tempStatus);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    

    public void hapusJanjiTemu(String tempIdJanjiTemu){
        
        try {
            
            String sql = "delete from janjitemu where idJanjiTemu = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempIdJanjiTemu);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    

    public void ubahObat(String tempIdObat, String tempIdPasien, String tempNamaObat, String tempDosis){
        
        try {
            
            String sql = "update obat set idPasien = ?, namaObat = ?, dosis = ? where idObat = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempIdObat);
            perintah.setString(2, tempIdPasien);
            perintah.setString(3, tempNamaObat);
            perintah.setString(4, tempDosis);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void simpanObat(String tempIdObat, String tempIdPasien, String tempNamaObat, String tempDosis){
        
        try {
            
            String sql = "insert into obat (idObat, idPasien, namaObat, dosis) value (?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempIdObat);
            perintah.setString(2, tempIdPasien);
            perintah.setString(3, tempNamaObat);
            perintah.setString(4, tempDosis);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    

    public void hapusObat(String tempIdObat){
        
        try {  
            String sql = "delete from obat where idObat = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempIdObat);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
