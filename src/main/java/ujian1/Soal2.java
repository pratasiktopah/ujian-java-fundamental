package ujian1;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author prata a.k.a. Pratasik Topah
Java Developer
Created on 09/09/2024 7:35
@Last Modified 09/09/2024 7:35
Version 1.0
*/
import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama film: ");
        String namaFilm = scanner.nextLine();

        // Mengubah semua huruf menjadi besar
        String namaFilmBesar = namaFilm.toUpperCase();

        System.out.println("Nama film dalam huruf besar: " + namaFilmBesar);
    }
}