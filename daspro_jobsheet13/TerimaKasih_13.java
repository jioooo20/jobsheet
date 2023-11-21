package daspro_jobsheet13;

public class TerimaKasih_13 {

    public static void UcapanTerimakasih() {
        System.out.println("Thank you for being the best teacher in the world.\n"
                + "You inspired in me a love for learning and made me feel like I could ask you everything.");
    }

    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        UcapanTerimakasih();
        String ucapan = "Terima kasih pak.. bu.. semoga sehat selalu";
        UcapanTambahan(ucapan);
    }
}

// public class TerimaKasih_13 {
// public static void main(String[] args) {
// System.out.println("Thank you for being the best teacher in the world.\n" +
// "You inspired in me a love for learning and made me feel like I could ask you
// everything.");
// }
// }