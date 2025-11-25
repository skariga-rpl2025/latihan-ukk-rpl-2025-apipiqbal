/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKK1;

/**
 *
 * @author Hype
 */
public class Karyawan {
      
    private String NIP;
    private String nama;
    private String divisi;
    
    public void setNIP(String NIP){
        this.NIP = NIP;
    }
    public void setnama(String nama){
        this.nama = nama;
    }
    public void setdivisi(String divisi){
        this.divisi = divisi;
    }
    
    public String getNIP(){
        return NIP;
    }
    public String getnama(){
        return nama;
    }
    public String getdivisi(){
        return divisi;
    
    }
}
