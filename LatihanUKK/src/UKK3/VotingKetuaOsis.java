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
public class VotingKetuaOsis {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int suaraA = 0;
        int suaraB = 0;
        String pilihan;

        System.out.println("===== PROGRAM VOTING KETUA OSIS =====");
        System.out.println("Masukkan suara untuk Kandidat A atau B");
        System.out.println("Ketik 'selesai' untuk mengakhiri\n");

        while (true) {
            System.out.print("Masukkan pilihan Anda (A/B): ");
            pilihan = input.nextLine().trim().toLowerCase();

            if (pilihan.equals("selesai")) {
                break;
            }

            if (pilihan.equals("a")) {
                suaraA++;
            } else if (pilihan.equals("b")) {
                suaraB++;
            } else {
                System.out.println("Input tidak valid! Masukkan hanya A, B, atau 'selesai'.");
            }
        }

        System.out.println("\n===== HASIL PEROLEHAN SUARA =====");
        System.out.println("Total suara Kandidat A: " + suaraA);
        System.out.println("Total suara Kandidat B: " + suaraB);

        input.close();
    } 
}
