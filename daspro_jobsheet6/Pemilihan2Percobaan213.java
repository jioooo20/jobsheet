package jobsheet.daspro_jobsheet6;
import java.util.Scanner;

public class Pemilihan2Percobaan213 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        
        int sudut1, sudut2, sudut3, totSudut;

        System.out.print("Masukkan Sudut 1: ");
        sudut1 = input13.nextInt();
        System.out.print("Masukkan Sudut 2: " );
        sudut2 = input13.nextInt();
        System.out.print("Masukkan Sudut 3: ");
        sudut3 = input13.nextInt();

        totSudut = sudut1 + sudut2 + sudut3;

        if (totSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut3 == sudut1)) {
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            } else 
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
            
        } else {
            System.out.println("Bukan Segitiga");
        }

    }
}

        // if(totSudut == 180){
        //     if ((sudut1 == 90) || (sudut1 == 90) || (sudut1 == 90))
        //     System.out.println("Segitiga tersebut adalah segitiga siku-siku");
        //     else
        //         System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        // } else
        // System.out.println("Bukan Segitiga");