package p9;
import java.util.Scanner;
public class Parkir05 {
    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        int jenis05, durasi05, total05 = 0;
        System.out.println("Masukkan jenis kendaraan");
        System.out.println("0. Keluar");
        System.out.println("1. Mobil");
        System.out.println("3. Motor");
        System.out.print("Jenis kendaraan: ");
        jenis05 = faf.nextInt();
        while (jenis05 != 0) {
            if (jenis05 == 1 || jenis05 == 2) {
                System.out.print("Input durasi (jam): ");
                durasi05 = faf.nextInt();
                if (durasi05 > 5) {
                    total05 += 12500;
                } else if (jenis05 == 1) {
                    total05 += durasi05 * 3000;
                } else if (jenis05 == 2) {
                    total05 += durasi05 * 2000;
                }
            }
            System.out.println("Masukkan jenis kendaraan");
            System.out.println("0. Keluar");
            System.out.println("1. Mobil");
            System.out.println("3. Motor");
            System.out.print("Jenis kendaraan: ");
            jenis05 = faf.nextInt();
        }
        System.out.println("Total pembayaran parkir: Rp " + total05);
        faf.close();
    }
}