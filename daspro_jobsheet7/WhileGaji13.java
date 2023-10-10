import java.util.Scanner;

public class WhileGaji13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String jabatan;
        int jumKaryawan, jumJamLembur;
        double gajiLembur = 0, totGajiLembur = 0;
        
        System.out.print("Masukkan jumlah karyawan: ");
        jumKaryawan = scan.nextInt();

        int i=0;
        while (i < jumKaryawan){
            System.out.print("Pilihan jabatan - Direktur, Manager, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-"+ (i+1) + ": ");
            jabatan = scan.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumJamLembur = scan.nextInt();
            i++;

            if(jabatan.equalsIgnoreCase("direktur")){
                continue;
            } else if (jabatan.equalsIgnoreCase("manager")){
                gajiLembur = jumJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")){
                gajiLembur = jumJamLembur * 75000;
            }
            totGajiLembur += gajiLembur;
            System.out.print("Total gaji lembur: " + totGajiLembur);
        }

    }
}
