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
public class DataPerusahaan {
     public static void main(String[] args) {
        
        Karyawan kry = new Karyawan();
        
        kry.setNIP("112233");
        kry.setnama("Afif");
        kry.setdivisi("RPL");
        
        System.out.println("=====DATA KARYAWAN=====");
        System.out.println("NIP :" + kry.getNIP());
        System.out.println("nama :" + kry.getnama());
        System.out.println("divisi :" + kry.getdivisi());
    }
}
