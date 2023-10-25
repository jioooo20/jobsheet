package daspro_jobsheet9;
import java.util.Scanner;

public class ArrayRataNilai13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jum = input.nextInt();

        int[]nilaiMhs = new int[jum];
        double lulus=0, tdkLulus=0;
        int jumTdkLulus = 0, jumLulus = 0;

        for(int i=0;i<nilaiMhs.length;i++){
            System.out.print("Masukkan nilai mahasiswa ke- "+ (i+1)+": ");
            nilaiMhs[i] = input.nextInt();
        if(nilaiMhs[i]>70){
            lulus += nilaiMhs[i];
            jumLulus++;                   
        }else{
            tdkLulus += nilaiMhs[i];
            jumTdkLulus++;                      
        }        
        }
        double rata2lulus = lulus/jumLulus;
        System.out.println("Rata-rata nilai = "+rata2lulus);
        double rata2tdkLulus = tdkLulus/jumTdkLulus;
        System.out.println("Rata-rata nilai = "+rata2tdkLulus);  
    }
}
