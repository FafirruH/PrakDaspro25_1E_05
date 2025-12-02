package P14;
import java.util.Scanner;
public class NilaiMahasiswa05 {
    static Scanner faf=new Scanner(System.in);
    static void isianArray05(int[] nilai05) {
        for (int i = 0; i < nilai05.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + (i+1) + " : ");
            nilai05[i] = faf.nextInt();
        }
    }
    static void tampilArray05(int [] nilai05) {
        System.out.println("Daftar Nilai Mahasiswa: ");
        for (int i = 0; i < nilai05.length; i++) {
            System.out.println("Mahasiswa " + (i+1) + " : " + nilai05[i]);
        }
    }
    static int hitTot05(int[] nilai05) {
        int total05 = 0;
        for (int n : nilai05) {
            total05 += n;
        }
        return total05;
    }
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jumlah05 = faf.nextInt();
        int[] NilaiMahasiswa05 = new int[jumlah05];
        isianArray05(NilaiMahasiswa05);
        tampilArray05(NilaiMahasiswa05);
        int total05 = hitTot05(NilaiMahasiswa05);
        System.out.println("Total nilai seluruh Mahasiswa : " + total05);
    }
}
