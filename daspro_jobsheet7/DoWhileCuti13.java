import java.util.Scanner;

public class DoWhileCuti13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumHari;
        String konfirmasi;
        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do{
            System.out.print("Apakah Anda ingin mengambil cuti(y/t) ? ");
            konfirmasi = sc.next();
            if (konfirmasi.equalsIgnoreCase("y")){
                System.out.print("Jumlah Hari: ");
                jumHari = sc.nextInt();
                // do{
                if(jumHari<=jatahCuti){
                    jatahCuti -= jumHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else{
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                    continue;
                }
            // }while(jatahCuti!=0);
            }
        } while (jatahCuti!=0);
    }
}
