package ujian1;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author prata a.k.a. Pratasik Topah
Java Developer
Created on 09/09/2024 8:13
@Last Modified 09/09/2024 8:13
Version 1.0
*/

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jumlah tiket: ");
        int jumlahTiket = scanner.nextInt();

        int hargaWeekday = 35000;
        int hargaWeekend = 45000;
        double diskon = 0.1;

        // Asumsi harga weekday, sesuaikan jika perlu
        int hargaSatuan = hargaWeekday;

        double totalHarga = jumlahTiket * hargaSatuan;

        if (jumlahTiket > 5) {
            totalHarga -= totalHarga * diskon;
        }

        System.out.println("Total harga (dengan diskon): " + totalHarga);
    }
}