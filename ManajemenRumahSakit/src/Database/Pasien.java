/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import CRUD.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import GUI.FramePasien;

/**
 *
 * @author HP
 */
public class Pasien {
   String idPasien, nama, umur, jenisKelamin, alamat;    
    
    ArrayList<String> idPasiens;
    ArrayList<String> namas;
    ArrayList<String> umurs;
    ArrayList<String> jenisKelamins;
    ArrayList<String> alamats;
  
     
    public Pasien (){
        idPasiens = new ArrayList<>();
        namas = new ArrayList<>();
        umurs = new ArrayList<>();
        jenisKelamins = new ArrayList<>();
        alamats = new ArrayList<>();
    }
    
    public Pasien(String idPasien, String nama, String umur, String jenisKelamin, String alamat){        
        this.idPasien = idPasien;
        this.nama = nama;
        this.umur = umur;        
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;    
    }
    
        public void inputIDPASIEN(String idPasien){
        this.idPasien = idPasien;    
        }
        
        public String ambilIDPASIEN(){
        return this.idPasien;    
        }
    
        public void inputNAMA(String nama){
        this.nama = nama;    
        }
        
        public String ambilNAMA(){
        return this.nama;    
        }
        
        public void inputUMUR(String umur){
        this.umur = umur;    
        }
        
        public String ambilUMUR(){
        return this.umur;    
        }
    
        public void inputJENISKELAMIN(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;    
        }
        
        public String ambilJENISKELAMIN(){
        return this.jenisKelamin;    
        }
        
        public void inputALAMAT(String alamat){
        this.alamat = alamat;       
        }
        
        public String ambilALAMAT(){
        return this.alamat;    
        }
}