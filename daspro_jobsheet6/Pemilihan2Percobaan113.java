package jobsheet.daspro_jobsheet6;
import java.util.Scanner;

public class Pemilihan2Percobaan113 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        int tahun;

        System.out.println("Masukkan Tahun: ");
        tahun = input13.nextInt();

        if(tahun % 4 == 0) {
            if(tahun%100 != 0)
            System.out.print("Tahun Kabisat");
        } else
        System.out.println("Bukan Tahun Kabisat");
    }
}
