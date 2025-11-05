package p11;
import java.util.Scanner;
public class arrayNilai05 {
    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        int[]nilaiAkhir05=new int[10];
        for (int i = 0; i < nilaiAkhir05.length; i++) {
            System.out.print("Masukkan Nilai Akhir ke- ");
            nilaiAkhir05[i]=faf.nextInt();
        }for (int i = 0; i < nilaiAkhir05.length; i++) {
            if (nilaiAkhir05[i]>70) {
                System.out.println("Mahasiswa ke- "+i+" Lulus!");
            }else{
                System.out.println("Mahasiswa ke- "+i+" Tidak Lulus");
            }
        }
        faf.close();
    }
    
}
