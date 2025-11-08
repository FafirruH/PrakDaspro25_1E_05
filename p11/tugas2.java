package p11;
import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = faf.nextInt();
        faf.nextLine();
        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = faf.nextLine();
            System.out.print("Masukkan harga: Rp ");
            hargaPesanan[i] = faf.nextDouble();
            faf.nextLine();
        }
        double total = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            total += hargaPesanan[i];
        }
        System.out.println("DAFTAR PESANAN");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("Total biaya semua pesanan: Rp " + total);
        faf.close();
    }
}
