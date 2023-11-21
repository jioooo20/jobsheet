package daspro_jobsheet13;

import java.util.Scanner;

public class NilaiMahasiswa {

    static int jumMhs;
    static int jumTugas;
    static String[] nama;
    static int[][] nilai;

    static void inputData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa: ");
        jumMhs = input.nextInt();
        System.out.print("Jumlah tugas: ");
        jumTugas = input.nextInt();

        nama = new String[jumMhs];
        nilai = new int[jumMhs][jumTugas];

        for (int i = 0; i < jumMhs; i++) {
            System.out.print("Nama mahasiswa ke-" + (i + 1) + ": ");
            nama[i] = input.next();
            for (int j = 0; j < jumTugas; j++) {
                System.out.print("Nilai tugas minggu ke " + (j + 1) + ": ");
                nilai[i][j] = input.nextInt();
            }
        }
        input.close();
    }

    static void tampilNilai() {
        for (int i = 0; i < jumMhs; i++) {
            System.out.print(nama[i] + ": ");
            for (int j = 0; j < jumTugas; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void mingguTertinggi() {
        int index = 0;

        for (int i = 0; i < jumTugas; i++) {
            int max = nilai[0][i];
            for (int j = 1; j < jumMhs; j++) {
                if (nilai[j][i] > max) {
                    max = nilai[j][i];
                    index = j;
                }
            }
            System.out.println("Nilai tertinggi pada minggu ke-" + (i + 1) + " oleh " + nama[index]);
        }
    }

    static void nilMhsTertinggi() {
        for (int i = 0; i < jumMhs; i++) {
            int max = nilai[i][0];
            int index = 0;
            for (int j = 1; j < jumTugas; j++) {
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
        inputData();
        tampilNilai();
        mingguTertinggi();
        nilMhsTertinggi();
    }
}
