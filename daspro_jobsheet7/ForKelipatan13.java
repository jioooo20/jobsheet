import java.util.Scanner;
public class ForKelipatan13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan, rata2, jumlah = 0, counter = 0;

        System.out.println("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        for (int i = 1; i<=50; i++){
            if(i % kelipatan == 0){
                jumlah += i;
                counter++;
            }
        }
        rata2 = jumlah / counter;

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adlaah %d\n", kelipatan, jumlah);
        System.out.println("Rata-rata dari seluruh bilangan kelipatan: " + rata2);

    }
}