import java.util.Scanner;

public class Bank14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jum_tab_awal, lama_menabung;
        double persentase_bunga = 0.02, bunga, jum_tab_akhir;

        System.out.println("masukkan jumlah tabungan awal anda: ");
        jum_tab_awal = input.nextInt();
        System.out.println("masukkan lama anda menabung: ");
        lama_menabung = input.nextInt();

        bunga = lama_menabung * persentase_bunga * jum_tab_awal;
        jum_tab_akhir = bunga + jum_tab_awal;

        System.out.println("Jumlah tabungan akhir anda adalah: " + jum_tab_akhir);

    }
}
