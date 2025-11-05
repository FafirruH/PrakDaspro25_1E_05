package p11;
import java.util.Scanner;
public class arrayNilai05 {
    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        int[]nilaiAkhir05=new int[10];
        for (int i = 0; i < nilaiAkhir05.length; i++) {
            System.out.print("Masukkan Nilai Akhir ke- ");
            nilaiAkhir05[i]=faf.nextInt();
        }for (int i = 0; i < 10; i++) {
            System.out.println("Nilai Akhir ke- "+i+"Adalah "+nilaiAkhir05[i]);
        }
        faf.close();
    }
    
}
