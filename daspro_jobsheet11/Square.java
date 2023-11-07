package jobsheet.daspro_jobsheet11;
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N+ ");
        int N = input.nextInt();
        for(int i=1;i<=N;i++){
            System.out.println("*");
        }
    }
}
