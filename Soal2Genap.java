/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aisyah
 */
import java.util.Scanner;

public class Soal2Genap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan rangking kamu: ");
        int rangking = input.nextInt();

        System.out.print("Apakah naik kelas? (true/false): ");
        boolean naikKelas = input.nextBoolean();

        // Proses
        boolean dapatHadiah = (rangking == 1) && (naikKelas);

        // Output
        System.out.println("Apakah kamu mendapat hadiah? " + dapatHadiah);
    }
}
