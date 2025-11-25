/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKK3;

import java.util.Scanner;

/**
 *
 * @author Hype
 */
public class KalkulatorSederhana {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== KALKULATOR SEDERHANA =====");
        System.out.println("Pilih Operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("\nMasukkan pilihan (1–4): ");

        int pilihan = input.nextInt();

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasil;

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil Penjumlahan: " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil Pengurangan: " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil Perkalian: " + hasil);
                break;
            case 4:
                if (angka2 == 0) {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                } else {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil Pembagian: " + hasil);
                }
                break;
            default:
                System.out.println("Pilihan tidak valid! Silakan pilih angka 1–4.");
        }

        input.close();
    }  
}
