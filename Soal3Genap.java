/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aisyah
 */
public class Soal3Genap {
    public static void main(String[] args) {

        // Input (karakter)
        char huruf1 = 'A';
        char huruf2 = 'B';

        // Proses
        int ascii1 = (int) huruf1;
        int ascii2 = (int) huruf2;
        int jumlah = ascii1 + ascii2;

        // Output
        System.out.println("Kode ASCII A: " + ascii1);
        System.out.println("Kode ASCII B: " + ascii2);
        System.out.println("Jumlah ASCII A + B: " + jumlah);
    }
}
