package P14;
import java.util.Scanner;
public class HitungBalok05 {
    public static void main(String[] args) {
        Scanner faf=new Scanner(System.in);
        int p05,l05,t05,L05,vol05;
        System.out.print("Masukkan Panjang : ");
        p05=faf.nextInt();
        System.out.print("Masukkan Lebar : ");
        l05=faf.nextInt();
        System.out.print("Masukkan Tinggi : ");
        t05=faf.nextInt();
        L05=p05*l05;
        System.out.println("Luas Persegi Panjang adalah "+L05);
        vol05=p05*l05*t05;
        System.out.println("Volume balok adalah "+vol05);
        faf.close();
    }
}
