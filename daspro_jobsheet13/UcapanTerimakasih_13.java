package daspro_jobsheet13;

import java.util.Scanner;

public class UcapanTerimakasih_13 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tulis NAMA orang yang ingin diucapkan: ");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }

    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + "\nMay the force be with you");
    }

    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        UcapanTerimakasih();
        String tambahan = "Pinjam dulu seratus";
        UcapanTambahan(tambahan);
    }
}
