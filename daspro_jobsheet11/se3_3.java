package jobsheet.daspro_jobsheet11;
import java.util.Scanner;

public class se3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;

        System.out.print("Masukkan baris segitiga(Minimal 3 baris): ");
        nilai = input.nextInt();

        for (int i = 1; i <= nilai; i++) {
            for (int j = 1; j <= nilai; j++) {
                if(i == 1 || i == nilai || j == 1 || j == nilai){
                    System.out.print(nilai);
                }else{
                    System.out.print(" ");
                }
            }      
            System.out.println();    
        }    
    }
}
