package daspro_jobsheet14;

import java.util.Scanner;

public class PenjumlahanRekursif {

    static int bertambahN(int start, int n, int tot) {
        if (start == n + 1) {
            System.out.print(" = " + tot);
            return (1);
        } else {
            System.out.print(start);
            if (n >= start + 1) {
                System.out.print(" + ");
            }
            return (bertambahN(start + 1, n, tot + start));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Masukkan angka: ");
        n = input.nextInt();
        bertambahN(1, n, 0);
        input.close();
    }

}
