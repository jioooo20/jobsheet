import java.util.Scanner;
public class WhileGaji13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String jabatan;
        int jumKaryawan, jumJamLembur;
        double gajiManager = 0, totGajiLembur = 0, gajiKaryawan = 0;
        
        System.out.print("Masukkan jumlah karyawan: ");
        jumKaryawan = scan.nextInt();

        int i=0;
        while (i < jumKaryawan){
            System.out.println("Pilihan jabatan - Direktur, Manager, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-"+ (i+1) + ": ");
            jabatan = scan.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumJamLembur = scan.nextInt();       

            if(jabatan.equalsIgnoreCase("direktur")){
                System.out.print("");                        
            } else if (jabatan.equalsIgnoreCase("manager")){
                gajiManager = jumJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")){
                gajiKaryawan = jumJamLembur * 75000;
            } else {
                System.out.println("Jabtan Invalid");
                continue;
            }
            i++;            
        }
            totGajiLembur += gajiKaryawan + gajiManager;
            System.out.println("Total gaji lembur: " + totGajiLembur);                       
    }
}
