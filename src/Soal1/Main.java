package Soal1;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
             // Meminta inputan tiga buah masukkan bilangan bulat negatif
             System.out.println("Masukkan tiga bilangan bulat negatif:");
             int bilangan1 = scanner.nextInt();
             int bilangan2 = scanner.nextInt();
             int bilangan3 = scanner.nextInt();
             // Melakukan penjumlahan
             int hasilTambah = bilangan1 + bilangan2 + bilangan3;
             System.out.println("Hasil Penjumlahan: " + hasilTambah);             
             // Melakukan pengurangan
             int hasilKurang = bilangan1 - bilangan2 - bilangan3;
             System.out.println("Hasil Pengurangan: " + hasilKurang);
             // Melakukan perkalian
             int hasilKali = bilangan1 * bilangan2 * bilangan3;
             System.out.println("Hasil Perkalian: " + hasilKali);
             // Melakukan pembagian           
             double hasilBagi = (double) bilangan1 / bilangan2 / bilangan3;
             System.out.println("Hasil Pembagian: " + hasilBagi);
             }}
    }

