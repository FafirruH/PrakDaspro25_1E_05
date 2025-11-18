package P12;
import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        int[][] surevi05 = new int[10][6];
        double[] rataResponden05 = new double[10];
        double[] rataPertanyaan05 = new double[6];
        System.out.println("PROGRAM SURVEY KEPUASAN PELANGGAN");
        System.out.println("Skala penilaian: 1-5");
        System.out.println("(1=Sangat Tidak Puas, 5=Sangat Puas)\n");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1) + " ---");
            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan " + (j + 1) + " (1-5): ");
                surevi05[i][j] = faf.nextInt();
                while (surevi05[i][j] < 1 || surevi05[i][j] > 5) {
                    System.out.print("Nilai tidak valid! Masukkan nilai 1-5: ");
                    surevi05[i][j] = faf.nextInt();
                }
            }
            System.out.println();
        }
        System.out.println("HASIL SURVEY YANG TERSIMPAN");
        System.out.println("Responden\tP1\tP2\tP3\tP4\tP5\tP6");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Responden " + (i + 1) + "\t");
            for (int j = 0; j < 6; j++) {
                System.out.print(surevi05[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("RATA-RATA NILAI SETIAP RESPONDEN");
        for (int i = 0; i < 10; i++) {
            int jumlah05 = 0;
            for (int j = 0; j < 6; j++) {
                jumlah05 += surevi05[i][j];
            }
            rataResponden05[i] = jumlah05 / 6;
            System.out.println("Responden ke-" + (i + 1) + "\t: " + rataResponden05[i]);
        }
        System.out.println("RATA-RATA NILAI SETIAP PERTANYAAN");
        for (int j = 0; j < 6; j++) {
            int jumlah05 = 0;
            for (int i = 0; i < 10; i++) {
                jumlah05 += surevi05[i][j];
            }
            rataPertanyaan05[j] = jumlah05 / 10;
            System.out.println("Pertanyaan ke-" + (j + 1) + "\t: " + String.format("%.2f", rataPertanyaan05[j]));
        }
        System.out.println("RATA-RATA KESELURUHAN");
        int totalKeseluruhan05 = 0;
        int jumlahData05 = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan05 += surevi05[i][j];
                jumlahData05++;
            }
        }
        double rataKeseluruhan05 = (double) totalKeseluruhan05 / jumlahData05;
        System.out.println("Total semua nilai\t: " + totalKeseluruhan05);
        System.out.println("Jumlah data\t\t: " + jumlahData05);
        System.out.println("Rata-rata keseluruhan\t: " + rataKeseluruhan05);
        faf.close();
    }
}