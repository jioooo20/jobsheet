import java.util.Scanner;

public class Lingkaran14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r;
        double kel, luas, phi = 3.14;

        System.out.println("Masukkan jari-jari lingakran: ");
        r = input.nextInt();

        kel = 2 * phi * r;
        luas = phi * r * r;

        System.out.println(kel);
        System.out.println(luas);

    }
}
