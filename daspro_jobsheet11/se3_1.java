package jobsheet.daspro_jobsheet11;
import java.util.Scanner;
public class se3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;

        System.out.print("Masukkan baris segitiga(Minimal 3 baris): ");
        nilai = input.nextInt();

        for (int i = 1; i <= nilai; i++) {
            for (int j = 1; j <= nilai - i; j++) {
            System.out.print(" ");
            }
            
            for (int k = 1; k <= i; k++) {
            System.out.print(k);
            }
            System.out.println();    
        }        
    }   
}
