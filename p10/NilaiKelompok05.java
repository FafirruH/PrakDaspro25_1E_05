package p10;
import java.util.Scanner;
public class NilaiKelompok05 {
    public static void main(String[] args) {
        Scanner faf=new Scanner(System.in);
        for (int i = 1; i <=6; i++) {
            System.out.println("Kelompok ke-"+i);
            float totalNilai05=0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("/tNilai Dari Kelompok Penilai ke-"+j+": ");
                int nilai05=faf.nextInt();
                totalNilai05+=nilai05;
            }
            float rataNilai05=totalNilai05/5;
            System.out.println("Rata-Rata adalah : "+rataNilai05);
        }
    }
    
}
