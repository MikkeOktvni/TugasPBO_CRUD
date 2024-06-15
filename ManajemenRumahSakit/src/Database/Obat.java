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
public class Obat {
    String idObat, idPasien, namaobat, dosis;    
    
    ArrayList<String> idObats;
    ArrayList<String> idPasiens;
    ArrayList<String> namaobats;
    ArrayList<String> dosiss;
     
    public Obat (){
        idObats = new ArrayList<>();
        idPasiens = new ArrayList<>();
        namaobats = new ArrayList<>();
        dosiss = new ArrayList<>();
    }
    
    public Obat(String idObat, String idPasien, String namaobat, String dosis){        
        this.idObat = idObat;
        this.idPasien = idPasien;        
        this.namaobat = namaobat;
        this.dosis = dosis;    
    }
    
        public void inputIDOBAT(String idObat){
        this.idObat = idObat;    
        }
        
        public String ambilIDOBAT(){
        return this.idObat;    
        }
        
        public void inputIDPASIEN(String idPasien){
        this.idPasien = idPasien;    
        }
        
        public String ambilIDPASIEN(){
        return this.idPasien;    
        }
    
        public void inputNAMAOBAT(String namaobat){
        this.namaobat = namaobat;    
        }
        
        public String ambilNAMAOBAT(){
        return this.namaobat;    
        }
        
        public void inputDOSIS(String dosis){
        this.dosis = dosis;       
        }
        
        public String ambilDOSIS(){
        return this.dosis;    
        }
}
