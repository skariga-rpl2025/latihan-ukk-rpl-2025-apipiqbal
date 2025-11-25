/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKK2;

/**
 *
 * @author Hype
 */
public class Kendaraan {
     private String noPolisi;
    private String merk;
    private int tahun;
    
    public void setnoPolisi(String noPolisi){
        this.noPolisi = noPolisi;
    }
    public void setmerk(String merk){
        this.merk = merk;
    }
    public void settahun(int tahun){
        this.tahun = tahun;
    }
    
    public String getnoPolisi(){
        return noPolisi;
    }
    public String getmerk(){
       return merk; 
    }
    public int gettahun(){
        return tahun;
    }
    
}
