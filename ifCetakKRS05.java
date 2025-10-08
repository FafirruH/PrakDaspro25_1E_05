import java.util.Scanner;
public class ifCetakKRSNoPresensi {

    public static void main(String[] args) {
        
        Scanner faf = new Scanner(System.in);
        System.out.println("--- Cetak KRS Siakad ---");
        System.out.println("Apakah UKT Sudah Lunas? (true/false)");
        boolean uktLunas = faf.nextBoolean();
        if (uktLunas) {
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("Silahkan Cetak KRS");
        } else {
            System.out.println("Silahkan Bayar ukt");
        }

    }
}