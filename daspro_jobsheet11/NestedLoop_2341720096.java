package jobsheet.daspro_jobsheet11;
import java.util.Scanner;
public class NestedLoop_2341720096 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] temps = new double[5][7]; 
        double rata2, total=0;

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i+1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");  
                temps[i][j] = input.nextDouble();
            }
            System.out.println();
        } 
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");  
            for (double temp : temps[i]) {
                total += temp;
                System.out.print(temp + " ");
            }
            rata2 = total/7;
            System.out.println();
            System.out.println("Rata rata: "+ rata2);
        }
    }
}


                // if(i == 0){
                //     kota1 += temps[i][j];
                // }
                // else if(i == 1){
                //     kota2 += temps[i][j];
                // }
                // else if(i == 2){
                //     kota3 += temps[i][j];
                // }
                // else if(i == 3){
                //     kota4 += temps[i][j];
                // }
                // else if(i == 4){
                //     kota5 += temps[i][j];
                // }