package ujian1;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author prata a.k.a. Pratasik Topah
Java Developer
Created on 09/09/2024 9:21
@Last Modified 09/09/2024 9:21
Version 1.0
*/

public class Soal5 {
    public static void main(String[] args) {
        int[] hargaTiket = {50000, 60000, 70000, 80000, 90000};
        int totalHarga = 0;

        for (int i = 0; i < hargaTiket.length; i++) {
            System.out.println("Harga tiket film " + (i+1) + ": " + hargaTiket[i]);
            totalHarga += hargaTiket[i];
        }

        System.out.println("Total harga tiket: " + totalHarga);
    }
}