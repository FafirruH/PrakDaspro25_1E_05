package p11;
import java.util.Scanner;
public class arrayRataNilai05 {
    public static void main(String[] args) {
        Scanner faf =new Scanner(System.in);
        double total05=0,totalTLulus05=0,rataTLulus05=0;
        double rata05,tLulus05=0;
        int lulus05=0;
        System.out.print("Maukkan Jumlah Mahasiswa : ");
        int jmlh05=faf.nextInt();
        int[] nilaiMhs05=new int[jmlh05];
        for (int i = 0; i < nilaiMhs05.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs05[i]=faf.nextInt();
        }
            for (int i = 0; i < nilaiMhs05.length; i++) {
                total05+=nilaiMhs05[i];
                if (nilaiMhs05[i]>70) {
                    lulus05++;
                }else{
                    tLulus05++;
                    totalTLulus05+=nilaiMhs05[i];
                }
            }
        rata05=total05/nilaiMhs05.length;
        rataTLulus05=totalTLulus05/tLulus05;
        System.out.println("Rata-rata Nilai = "+rata05);
        System.out.println("Jumlah Mahasiswa Yang lulus : "+lulus05);
        System.out.println("Rata-rata Nilai Tidak Lulus : "+rataTLulus05);
        faf.close();
    }
}
