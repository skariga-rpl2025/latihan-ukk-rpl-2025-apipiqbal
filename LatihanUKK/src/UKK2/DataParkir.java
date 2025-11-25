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
public class DataParkir {
    public static void main(String[] args) {
        
        Kendaraan mobil =  new Kendaraan();
        
        mobil.setnoPolisi("N 3557 EAA");
        mobil.setmerk("Honda");
        mobil.settahun(2009);
        
        System.out.println("===== DATA KENDARAAN =====");
        System.out.println("No. Polisi : " + mobil.getnoPolisi());
        System.out.println("Merk       : " + mobil.getmerk());
        System.out.println("Tahun      : " + mobil.gettahun());
    
    } 
}
