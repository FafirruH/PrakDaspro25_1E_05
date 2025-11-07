package p11;
import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner faf=new Scanner(System.in);
        System.out.print("Maukkan Jumlah Mahasiswa : ");
        int jmlh05=faf.nextInt();
        int rata05=0,total05=0,tertinggi05 = 0, terendah05 = 100;
        int[] nilai05=new int[jmlh05];
        for (int i = 0; i < nilai05.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" : ");
            nilai05[i]=faf.nextInt();
            total05+=nilai05[i];
            if (nilai05[i] > tertinggi05) {
                tertinggi05 = nilai05[i];
            }
            if (nilai05[i] < terendah05) {
                terendah05 = nilai05[i];
            }
        }
        for (int i = 0; i < nilai05.length; i++) {
            System.out.println("Nilai Mahasiswa ke-"+(i+1)+" Adalah "+nilai05[i]);
        }
        rata05=total05/nilai05.length;
        System.out.println("Rata-rata Nilai Dari "+nilai05.length+" Mahasiswa Adalah "+rata05);
        System.out.println("Nilai Tertinggi Adalah "+tertinggi05);
        System.out.println("Nilai Tertinggi Adalah "+terendah05);
        faf.close();
    }
}
