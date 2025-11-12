package P12;
import java.util.Scanner;
public class bioskopWithScanner05 {
    public static void main(String[] args) {
        Scanner faf=new Scanner(System.in);
        int baris05,kolom05;
        String nama05,next05;
        String[][]penonton05=new String[4][2];
        while (true) {
            System.out.print("Masukkan Nama: ");
            nama05=faf.nextLine();
            System.out.print("Masukkan Baris: ");
            baris05=faf.nextInt();
            System.out.print("Masukkan Kolom: ");
            kolom05=faf.nextInt();
            faf.nextLine();

            penonton05[baris05-1][kolom05-1]=nama05;
            System.out.print("Input Penonton Lainnya ? (y/n) : ");
            next05=faf.next();
            if (next05.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
