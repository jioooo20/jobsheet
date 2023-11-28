package daspro_jobsheet14;

import java.util.Scanner;

public class Fibonacci {
    static int fiboo(int n) {
        if (n <= 1) {
            return (n);
        } else {
            return fiboo(n - 1) + fiboo(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minggu;
        System.out.print("Minggu ke: ");
        minggu = input.nextInt();
        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + minggu + " : " + fiboo(minggu));
        input.close();
    }
}
