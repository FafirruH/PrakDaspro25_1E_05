package p9;
import java.util.Scanner;
public class TiketBioskop05 {
    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        double hargaTiket05 = 50000,totalPendapatan05 = 0;
        System.out.print("Masukkan jumlah pelanggan: ");
        int pelanggan05 = faf.nextInt();
        int i = 0;
        while (i < pelanggan05) {
            System.out.print("Masukkan jumlah tiket pelanggan ke-" + (i + 1) + ": ");
            int tiket05 = faf.nextInt();
            if (tiket05 < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan input ulang.");
                continue;
            }
            double totalBayar05;
            if (tiket05 > 10) {
                totalBayar05 = tiket05 * hargaTiket05 * 0.15;
            } else if (tiket05 > 4 && tiket05 <= 10) {
                totalBayar05 = tiket05 * hargaTiket05 * 0.10;
            } else {
                totalBayar05 = tiket05 * hargaTiket05;
            }
            System.out.println("Total bayar untuk pelanggan ke-" + (i + 1) + ": Rp " + totalBayar05);
            totalPendapatan05 += totalBayar05;
            i++;
        }
        System.out.println("Total penjualan tiket hari ini: Rp " + totalPendapatan05);
        faf.close();
    }
}