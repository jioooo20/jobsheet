import java.util.Scanner;

public class PemilihanPercobaan113 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = input13.nextInt();
        String hasil = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " bilangan " + hasil);
    }
}

// import java.util.Scanner;

// public class PemilihanPercobaan114 {
// public static void main(String[] args) {
// Scanner input13 = new Scanner(System.in);

// System.out.println("Masukkan angka: ");
// int angka = input13.nextInt();
// if (angka % 2 == 0)
// System.out.println("Angka " + angka + " bilangan genap");
// else
// System.out.println("Angka " + angka + " bilangan ganjil");
// }
// }
