package daspro_jobsheet13;

import java.util.Scanner;

public class kubus13 {

    static double volKub(double s) {
        double vol;
        vol = s * s * s;
        return vol;
    }

    static double luaskubus(double s) {
        double luas;
        luas = 6 * (s * s);
        return luas;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double s;
        System.out.print("Masukkan sisi kubus: ");
        s = input.nextDouble();
        double volkub = volKub(s);
        double luaskubus = luaskubus(s);
        System.out.println("Volume Kubus: " + volkub);
        System.out.println("Luas Kubus: " + luaskubus);
        input.close();
    }
}
