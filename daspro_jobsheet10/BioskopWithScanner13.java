package daspro_jobsheet10;
import java.util.Scanner;
public class BioskopWithScanner13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, next;
        int baris, kolom, menu;
        String[][] penonton = new String[4][2];       

        do{
        System.out.println("=========================");
        System.out.println("\t Menu");
        System.out.println("=========================");
        System.out.println("1. Input Data Penonton");
        System.out.println("2. Tampilkan Daftar Penonton");
        System.out.println("3. Exit");
        System.out.print("Masukkan Nomer Menu: ");
        menu = input.nextInt();
        if (menu == 3 ) {
            break;
        }
        switch (menu) {
            case 1:
        while (true) {
            System.out.println("===Input Data Penonton===");
            System.out.print("Masukkan nama: ");
            nama = input.next();
            System.out.print("Masukkan baris: ");
            baris = input.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = input.nextInt();
            input.nextLine();
            
            if(baris<1 || baris> penonton.length || kolom < 1 || kolom > penonton[0].length){
                System.out.println("Nomor Baris/Kolom Kursi Tidak Tersedia");
                continue;
            }

                   if(penonton[baris-1][kolom-1] != null){
                        System.out.println("Kursi telah terisi, masukkan baris dan kolom kembali.");
                        continue;
                   }else{
                    penonton[baris-1][kolom-1] = nama;
                   }


            
            System.out.print("Input penonton lainnya? (y/n): ");
            next = input.nextLine();

            if(next.equalsIgnoreCase("n")){
                break;
            }
        }                
                break;//break menu1

            case 2:
            System.out.println("===Tampilkan Daftar Penonton===");
            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[i].length; j++) {
                    if(penonton[i][j] != null){
                        System.out.println("Penonton pada baris " + (i+1) + ", kolom " + (j+1) + ": " + penonton[i][j]);                    
                    }else{
                        System.out.println("Penonton pada baris " + (i+1) + ", kolom " + (j+1) + ": " +"***");
                    }
                }
            }
                break;//break menu2
        
            default:
            System.out.println("Masukkan Nomer yang ada pada menu!!!");
                break; //break def
        }
        }while( menu != 3);
    }
}


