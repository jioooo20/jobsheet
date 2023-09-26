import java.util.Scanner;

public class Gaji14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlMasuk, jmlTdkMasuk, totGaji;
        int gaji, potGaji;

        System.out.println("Gaji harian: ");
        gaji = input.nextInt();
        System.out.println("Potongan gaji harian: ");
        potGaji = input.nextInt();

        System.out.println("Masukkan jumlah hari masuk kerja anda: ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan jumlah hari tidak masuk kerja anda: ");
        jmlTdkMasuk = input.nextInt();

        totGaji = (jmlMasuk * gaji) - (jmlTdkMasuk * potGaji);

        System.out.println("Gaji yang anda terima adalah " + totGaji);

    }
}

// int jmlMasuk, jmlTdkMasuk, totGaji;
// int gaji = 40000, potGaji = 25000;

// System.out.println("Masukkan jumlah hari masuk kerja anda: ");
// jmlMasuk = input.nextInt();
// System.out.println("Masukkan jumlah hari tidak masuk kerja anda: ");
// jmlTdkMasuk = input.nextInt();

// totGaji = (jmlMasuk * gaji) - (jmlTdkMasuk * potGaji);

// System.out.println("Gaji yang anda terima adalah " + totGaji);