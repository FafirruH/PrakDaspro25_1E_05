package P14;
import java.util.Scanner;
public class Kafe05 {
    static Scanner faf = new Scanner(System.in);
    public static void menu05(String namaPelanggan05, boolean isMember05, String kodepromo05) {
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
    public static int hitungTotalHarga05(int pilihanMenu05,int banyakItem05){
        int[]hargaItem05={15000,20000,22000,12000,10000,18000};
        int hargaTotal05=hargaItem05[pilihanMenu05-1]*banyakItem05;
        return hargaTotal05;
    }
    public static void main(String[] args) {
        menu05("Budi", true,"DISKON30" );
        System.out.print("\nMasukkan nomor menu yang Anda ingin pesan: ");
        int pilihanMenu05=faf.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem05=faf.nextInt();
        int totalHarga05=hitungTotalHarga05(pilihanMenu05, banyakItem05);
        System.out.println("Total harga untuk pesanana Anda: Rp"+totalHarga05);
    }
}