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
public class ProgramPendaftaranAnggotaOsis {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalAnggota = 0;
        String nama;
        String jawaban;

        System.out.println("===== PENDAFTARAN ANGGOTA GYM =====");

        do {
            System.out.print("\nMasukkan nama anggota: ");
            nama = input.nextLine();
            totalAnggota++;

            System.out.print("Daftar anggota lagi? [ya/tidak] ");
            jawaban = input.nextLine().trim().toLowerCase();

        } while (jawaban.equals("ya"));

        System.out.println("\n----------------------------------");
        System.out.println("Total anggota yang didaftarkan: " + totalAnggota);

        input.close();
    }
}
