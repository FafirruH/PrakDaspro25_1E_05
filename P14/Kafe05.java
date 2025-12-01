package P14;

public class Kafe05 {
    static void menu05(String namaPelanggan05, boolean isMember05, String kodepromo05) {
        System.out.println("Selamat Datang, " + namaPelanggan05 + "!");
        if (isMember05) {
            System.out.println("Anda Adalah Member, dapatkan diskon 10% untuk setiap pembelian");
        }
        if (kodepromo05.equals("DISKON50")) {
            System.out.println("Kode Promo: Diskon 50%");
        } else if (kodepromo05.equals("DISKON30")) {
            System.out.println("Kode Promo: Diskon 30%");
        } else {
            System.out.println("Kode Promo: INVALID");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp. 20,000");
        System.out.println("3. Latte - Rp. 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar  - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");

    }

    public static void main(String[] args) {
        menu05("Andi", true,"DISKON50" );
    }
}