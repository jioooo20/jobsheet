package jobsheet.daspro_jobsheet11;
import java.util.Scanner;

public class se3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;

        System.out.print("Masukkan baris segitiga(Minimal 5 baris): ");
        nilai = input.nextInt();

        for (int i = 0; i <= nilai; i++) {
            for (int j = 1; j <= nilai - i; j++) {
            System.out.print("*");
            }
        
            System.out.println();    
        }    
    }
}
