/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aisyah
 */
import java.util.Scanner;

public class Soal1Genap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan bilangan pecahan pertama: ");
        double a = input.nextDouble();

        System.out.print("Masukkan bilangan pecahan kedua: ");
        double b = input.nextDouble();

        System.out.print("Masukkan bilangan pecahan ketiga: ");
        double c = input.nextDouble();
                                                                                                                                                                                                                                                                   
        // Proses
        double tambah = a + b + c;
        double kurang = a - b - c;
        double kali = a * b * c;
        double bagi = a / b / c;                                                                                                                                                                     

        // Output
        System.out.println("Hasil Penjumlahan: " + tambah);
        System.out.println("Hasil Pengurangan: " + kurang);
        System.out.println("Hasil Perkalian: " + kali);
        System.out.println("Hasil Pembagian: " + bagi);
    }
}
