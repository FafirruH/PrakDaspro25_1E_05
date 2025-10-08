import java.util.Scanner;
public class IfElseCetakKRS05 {
    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini: ");
        int semester05 = faf.nextInt();

        if (semester05 == 1) {
            System.out.println("KRS semester 1 ditampilkan");
        } else if (semester05 == 2) {
            System.out.println("KRS semester 2 ditampilkan");
        }else if (semester05 == 3) {
            System.out.println("KRS semester 3 ditampilkan");
        }else if (semester05 == 4) {
            System.out.println("KRS semester 4 ditampilkan");
        }else if (semester05 == 5) {
            System.out.println("KRS semester 5 ditampilkan");
        }else if (semester05 == 6) {
            System.out.println("KRS semester 6 ditampilkan");
        }else if (semester05 == 7) {
            System.out.println("KRS semester 7 ditampilkan");
        }else if (semester05 == 8) {
            System.out.println("KRS semester 8 ditampilkan");
        }else{
            System.out.println("semester tidak valid");
        }
        faf.close();
    }
}
