import java.util.Scanner;

public class PemilihanPercobaan213 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.println("Nilai uas\t: ");
        float uas = input13.nextFloat();
        System.out.println("Nilai uts\t: ");
        float uts = input13.nextFloat();
        System.out.println("Nilai kuis\t: ");
        float kuis = input13.nextFloat();
        System.out.println("Nilai tugas\t: ");
        float tugas = input13.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String nilaiHuruf;
        if (total > 80 && total <= 100) {
            nilaiHuruf = "A";
        } else if (total > 73) {
            nilaiHuruf = "B+";
        } else if (total > 65) {
            nilaiHuruf = "B";
        } else if (total > 60) {
            nilaiHuruf = "C+";
        } else if (total > 50) {
            nilaiHuruf = "C";
        } else if (total > 39) {
            nilaiHuruf = "D";
        } else if (total < 39 && total >= 0) {
            nilaiHuruf = "E";
        } else {
            nilaiHuruf = "Invalid";
        }

        String message = (total < 65) ? "Remidi" : "Tidak remidi";

        System.out.println("===================================================");
        if (total >= 0 && total <= 100) {
            System.out.println("Nilai akhir = " + nilaiHuruf + ", sehingga " + message);
        } else {
            System.out.println("Anda kuliah??");
        }

    }
}

// String message = (total < 65) ? "Remidi" : "Tidak remidi";
// System.out.println("Nilai akhir = " + nilaiHuruf + ", sehingga " + message);

// public static void main(String[] args) {
// Scanner input13 = new Scanner(System.in);

// System.out.println("Nilai uas\t: ");
// float uas = input13.nextFloat();
// System.out.println("Nilai uts\t: ");
// float uts = input13.nextFloat();
// System.out.println("Nilai kuis\t: ");
// float kuis = input13.nextFloat();
// System.out.println("Nilai tugas\t: ");
// float tugas = input13.nextFloat();

// float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

// String message = (total < 65) ? "Remidi" : "Tidak remidi";
// System.out.println("Nilai akhir = " + total + " sehingga " + message);
// }