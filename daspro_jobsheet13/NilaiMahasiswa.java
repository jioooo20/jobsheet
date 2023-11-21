package daspro_jobsheet13;

import java.util.Scanner;

public class NilaiMahasiswa {

    static String[] nama = { "Sari", "Rina", "Yani", "Dwi", "Lusi" };
    static int[][] nilai = new int[5][7];
    // {
    // { 20, 19, 25, 20, 10, 0, 10 },
    // { 30, 30, 40, 10, 15, 20, 25 },
    // { 5, 0, 20, 25, 10, 5, 45 },
    // { 50, 0, 7, 8, 0, 30, 60 },
    // { 15, 10, 16, 15, 10, 10, 5 }
    // };

    // Fungsi untuk meninputkan data nilai mahasiswa
    static void inputData() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Masukkan nilai " + nama[i] + " untuk 7 minggu:");
            for (int j = 0; j < 7; j++) {
                nilai[i][j] = input.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa dari minggu pertama sampai
    // ketujuh
    static void tampilNilai() {
        for (int i = 0; i < nama.length; i++) {
            System.out.print(nama[i] + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari pada hari keberapakah terdapat nilai tertinggi dibanding
    // hari lain
    static void mingguTertinggi() {
        int index = 0;

        for (int i = 0; i < 7; i++) {
            int max = nilai[0][i];
            for (int j = 1; j < nama.length; j++) {
                if (nilai[j][i] > max) {
                    max = nilai[j][i];
                    index = j;
                }
            }
            System.out.println("Nilai tertinggi pada minggu ke-" + (i + 1) + " oleh " + nama[index]);
        }
    }

    // Fungsi untuk menampilkan mahasiswa yang memiliki nilai tertinggi beserta
    // minggu keberapa
    static void nilMhsTertinggi() {
        for (int i = 0; i < nama.length; i++) {
            int max = nilai[i][0];
            int index = 0;
            for (int j = 1; j < 7; j++) {
                if (nilai[i][j] > max) {
                    max = nilai[i][j];
                    index = j;
                }
            }
            System.out.println(
                    nama[i] + " memiliki nilai tertinggi " + max + " pada minggu ke-" + (index + 1));
        }
    }

    public static void main(String[] args) {
        // Menjalankan fungsi-fungsi yang diminta
        inputData();
        tampilNilai();
        mingguTertinggi();
        nilMhsTertinggi();
    }
}
