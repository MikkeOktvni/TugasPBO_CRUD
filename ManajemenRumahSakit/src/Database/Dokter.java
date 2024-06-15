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
/**
 *
 * @author HP
 */
public class Dokter {
    String idDokter, nama, spesialis, telepon;    
    
    ArrayList<String> idDokters;
    ArrayList<String> namas;
    ArrayList<String> spesialiss;
    ArrayList<String> telepons;
     
    public Dokter (){
        idDokters = new ArrayList<>();
        namas = new ArrayList<>();
        spesialiss = new ArrayList<>();
        telepons = new ArrayList<>();
    }
    
    public Dokter(String idDokter, String nama, String spesialis, String telepon){        
        this.idDokter = idDokter;
        this.nama = nama;        
        this.spesialis = spesialis;
        this.telepon = telepon;    
    }
    
        public void inputIDDOKTER(String idDokter){
        this.idDokter = idDokter;    
        }
        
        public String ambilIDDOKTER(){
        return this.idDokter;    
        }
        
        public void inputNAMA(String nama){
        this.nama = nama;    
        }
        
        public String ambilNAMA(){
        return this.nama;    
        }
    
        public void inputSPESIALIS(String spesialis){
        this.spesialis = spesialis;    
        }
        
        public String ambilSPESIALIS(){
        return this.spesialis;    
        }
        
        public void inputTELEPON(String telepon){
        this.telepon = telepon;       
        }
        
        public String ambilTELEPON(){
        return this.telepon;    
        }
}