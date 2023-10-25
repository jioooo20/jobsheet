package daspro_jobsheet9;
import java.util.Scanner;
public class LinearSearch13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jum = input.nextInt();
        int[] arrayInt = new int[jum];
        int key;
        int hasil=-1;

        for(int i = 0;i<arrayInt.length;i++){
            System.out.print("Masukkan elemen array ke-" +i+" : ");
            arrayInt[i] = input.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        key = input.nextInt();
        for(int i=0;i<arrayInt.length; i++){
            if(arrayInt[i] == key){
                hasil = i;
                break;
            }
        } 
        if(hasil != -1){
            System.out.println("Key ada di posisi indeks ke-"+hasil); 
        }else{
            System.out.println("Key tidak ditemukan");
        }
    }
}

