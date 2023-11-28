package daspro_jobsheet14;

import java.util.Scanner;

public class DeretDescendingRekursif {

    static int berkurang0(int n) {
        if (n == 0) {
            return (1);
        } else {
            System.out.print(n + " - ");
            return (berkurang0(n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Masukkan angka: ");
        n = input.nextInt();
        berkurang0(n);
        input.close();
    }

}
