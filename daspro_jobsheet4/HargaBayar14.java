import java.util.Scanner;

public class HargaBayar14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String merk;
        int harga, jumBuk, jumHal;
        double dis, total, bayar, jumDis;

        System.out.println("Masukkan merk buku: ");
        merk = input.nextLine();
        System.out.println("Masukkan jumlah halaman buku: ");
        jumHal = input.nextInt();
        System.out.println("Masukkan harga buku: ");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah buku yang dibeli: ");
        jumBuk = input.nextInt();
        System.out.println("Masukkan diskon: ");
        dis = input.nextDouble();

        total = harga * jumBuk;
        jumDis = total * dis;
        bayar = total - jumDis;

        System.out.println("======================Toko Vano======================");
        System.out.println("Buku merk " + merk);
        System.out.println("Isi halaman buku berjumlah " + jumHal);
        System.out.println("Diskon yang anda dapatkan adalah: " + jumDis);
        System.out.println("Jumlah yang harus dibayarkan adalah: " + bayar);

    }
}

// int harga, jumlah;
// double dis = 0.1, total, bayar, jmlDis;

// System.out.println("Harga barang yang dibeli: ");
// harga = input.nextInt();
// System.out.println("Jumlah barang yang dibeli: ");
// jumlah = input.nextInt();

// total = harga * jumlah;
// jmlDis = total * dis;
// bayar = total - jmlDis;

/* */
System.out.println("Diskon yang anda dapatkan adalah: "+jmlDis);System.out.println("Jumlah yang hrus dibayar adalah: "+bayar);