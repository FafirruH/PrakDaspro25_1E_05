package p11;
import java.util.Scanner;
public class arrayRataNilai05 {
    public static void main(String[] args) {
        Scanner faf =new Scanner(System.in);
        int[] nilaiMhs05=new int[10];
        double total05=0;
        double rata05;
        for (int i = 0; i < nilaiMhs05.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs05[i]=faf.nextInt();
        }
            for (int i = 0; i < nilaiMhs05.length; i++) {
                total05+=nilaiMhs05[i];
            }
        rata05=total05/nilaiMhs05.length;
        System.out.println("Rata-rata Nilai = "+rata05);
        faf.close();
    }
}
