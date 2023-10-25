package daspro_jobsheet9;
import java.util.Scanner;
public class Tugas13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    
    
        System.out.print("Masukkan banyak mahasiswa: ");
        int jum = input.nextInt();
        int[] nilMhs = new int[jum];
        int tot = 0, nilHigh, nilLow;
        double rata2;

        for(int i = 0; i< nilMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilMhs[i] = input.nextInt();
            tot += nilMhs[i];
        }

        nilHigh = nilMhs[0];
        nilLow = nilMhs[0];
        for(int i = 0;i<nilMhs.length; i++){
            if(nilMhs[i]>nilHigh){
                nilHigh = nilMhs[i];
            }else if(nilMhs[i]<nilLow){
                nilLow = nilMhs[i];
            }
        }
        rata2 = tot / nilMhs.length;
        System.out.println("Nilat tertinggi: "+nilHigh);
        System.out.println("Nilai terendah: " + nilLow);
        System.out.println("Nilai rata-rata: " + rata2);
    }
    
}
