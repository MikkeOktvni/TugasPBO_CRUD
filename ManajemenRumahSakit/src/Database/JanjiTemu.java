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
public class JanjiTemu {

    String idJanjitemu, idPasien, idDokter, tanggaljanji, status;    
    
    ArrayList<String> idJanjitemus;
    ArrayList<String> idPasiens;
    ArrayList<String> idDokters;
    ArrayList<String> tanggaljanjis;
    ArrayList<String> statuss;
     
    public JanjiTemu (){
        idJanjitemus = new ArrayList<>();
        idPasiens = new ArrayList<>();
        idDokters = new ArrayList<>();
        tanggaljanjis = new ArrayList<>();
        statuss = new ArrayList<>();
    }
    
    public JanjiTemu(String idJanjitemu, String idPasien, String idDokter, String tanggaljanji, String status){        
        this.idJanjitemu = idJanjitemu;
        this.idPasien = idPasien;        
        this.idDokter = idDokter;
        this.tanggaljanji = tanggaljanji; 
        this.status = status;
    }
    
        public void inputIDJANJITEMU(String idJanjitemu){
        this.idJanjitemu = idJanjitemu;    
        }
        
        public String ambilIDJANJITEMU(){
        return this.idJanjitemu;    
        }
        
        public void inputIDPASIEN(String idPasien){
        this.idPasien = idPasien;    
        }
        
        public String ambilIDPASIEN(){
        return this.idPasien;    
        }
    
        public void inputIDDOKTER(String idDokter){
        this.idDokter = idDokter;    
        }
        
        public String ambilIDDOKTER(){
        return this.idDokter;    
        }
        
        public void inputTANGGALJANJI(String tanggaljanji){
        this.tanggaljanji = tanggaljanji;       
        }
        
        public String ambilTANGGALJANJI(){
        return this.tanggaljanji;    
        }
        
        public void inputSTATUS(String status){
        this.status = status;       
        }
        
        public String ambilSTATUS(){
        return this.status;    
        }
}
