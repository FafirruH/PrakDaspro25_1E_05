package p10;
import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        System.out.print("Jumlah Cabang Kafe : ");
        int cabang05 = faf.nextInt();
        int totalPelanggan05 = 0;
        int totalItem05 = 0;
        System.out.println("\n=== Input Penjualan Per Cabang ===");
        for (int i = 1; i <= cabang05; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah Pelanggan : ");
            int pelanggan05 = faf.nextInt();
            int itemCabang05 = 0;
            for (int j = 1; j <= pelanggan05; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item : ");
                int pesanan05 = faf.nextInt();
                itemCabang05 += pesanan05;
            }
            System.out.println("Cabang " + i);
            System.out.println("- Pelanggan : " + pelanggan05);
            System.out.println("- Item Terjual : " + itemCabang05);
            totalPelanggan05 += pelanggan05;
            totalItem05 += itemCabang05;
        }
        System.out.println("\nTotal Seluruh Cabang");
        System.out.println("Pelanggan : " + totalPelanggan05);
        System.out.println("Item Terjual : " + totalItem05);
        faf.close();
    }
}
