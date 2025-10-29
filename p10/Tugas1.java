package p10;
import java.util.Scanner;

public class Tugas1{
    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int nilai05 = faf.nextInt();
        int jumlah05 = 0;
        for (int i = 1; i <= nilai05; i++) {
            jumlah05 = jumlah05 + (i * i);
            System.out.print("Nilai = " + i + " Jumlah kuadrat = ");
            for (int j = 1; j <= i; j++) {
                System.out.print((j * j));
                if (j < i) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + jumlah05);
        }
        System.out.println("Hasil akhir: Jumlah kuadrat 1 sampai " + nilai05 + " = " + jumlah05);
        
        faf.close();
    }
}