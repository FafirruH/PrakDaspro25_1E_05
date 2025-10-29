package p10;
import java.util.Scanner;
public class NilaiKelompok05{
    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        float RataTertinggi05 = 0;
        int kelompokTertinggi05 = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.println("Kelompok ke-" + i);
            float totalNilai05 = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("\tNilai dari Kelompok Penilai ke-" + j + ": ");
                int nilai05 = faf.nextInt();
                totalNilai05 += nilai05;
            }
            float rataNilai05 = totalNilai05 / 5;
            System.out.println("Rata-rata adalah: " + rataNilai05);
            System.out.println("-----------------------------------");
            if (rataNilai05 > RataTertinggi05) {
                RataTertinggi05 = rataNilai05;
                kelompokTertinggi05 = i;
            }
        }
        System.out.println("=== HASIL AKHIR ===");
        System.out.println("Kelompok dengan rata-rata tertinggi: Kelompok ke-" + kelompokTertinggi05);
        System.out.println("Dengan nilai rata-rata: " + RataTertinggi05);
        faf.close();
    }
}