package Soal2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Meminta inputan nominal uang
            System.out.print("Masukkan nominal uang : ");
            int uang = scanner.nextInt();
            // Memeriksa apakah tidak ada kelas kuliah
            System.out.print("Apakah pasangan anda sedang tidak ada kelas kuliah? (true/false): ");
            boolean tidakAdaKelasKuliah = scanner.nextBoolean();            
            // Memeriksa apakah uang cukup untuk membeli migacoan dan tidak ada kelas kuliah
            if (uang > 10000 && tidakAdaKelasKuliah) {
                System.out.println("Anda bisa membeli migacoan!");
            } else {
                System.out.println("Anda tidak bisa membeli migacoan.");
            }
        }
    }
}
    
    

