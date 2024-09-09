package ujian1;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author prata a.k.a. Pratasik Topah
Java Developer
Created on 09/09/2024 8:17
@Last Modified 09/09/2024 8:17
Version 1.0
*/

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] film = new String[5];

        System.out.println("Daftar film bioskop");
        for (int i = 0; i < film.length; i++) {
            System.out.print("Masukkan nama film " + (i+1) + ": ");
            film[i] = scanner.nextLine();
        }

        System.out.println("Film yang ingin ditonton:");
        for (int i = 0; i < film.length; i++) {
            System.out.println((i+1) + ". " + film[i]);
        }
    }
}
