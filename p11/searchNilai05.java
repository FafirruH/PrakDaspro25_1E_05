package p11;
import java.util.Scanner;
public class searchNilai05 {
    public static void main(String[] args) {
        Scanner faf=new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Nilai Yang Akan Di Input : ");
        int jumlah05=faf.nextInt();
        int[]arrNilai05=new int[jumlah05];
        int hasil05=0;
        for (int i = 0; i < arrNilai05.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" : ");
            arrNilai05[i]=faf.nextInt();
        }
        System.out.print("Masukkan Nilai Yang Ingin Dicari : ");
        int key05=faf.nextInt();
        for (int i = 0; i < arrNilai05.length; i++) {
            if (arrNilai05[i]==key05) {
                hasil05=i+1;
                System.out.println("Nilai "+key05+" Ketemu, Merupakan Nilai Mahasiswa ke-"+hasil05);
                break;
            }else{
                System.out.println("Nilai Tidak Ditemukan");
                break;
            }
        }
        faf.close();
    }
}