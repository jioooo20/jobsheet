package daspro_jobsheet13;

import java.util.Scanner;

public class Percobaan613 {

    static int Hitungluas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int Hitungvolume(int tinggi, int a, int b) {
        int volume = Hitungluas(a, b) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.println("Panjang:");
        p = input.nextInt();
        System.out.println("Lebar:");
        l = input.nextInt();
        System.out.println("Tinggi:");
        t = input.nextInt();

        L = Hitungluas(p, l);
        System.out.println("Luas persegi panjang: " + L);
        vol = Hitungvolume(t, p, l);
        System.out.println("Volume balok: " + vol);
    }
}
