package p11;
import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        String[] menu05 = {"Nasi Goreng","Mie Goreng","Roti Bakar","Kentang Goreng","Teh Tarik","Cappucino","Chocolate Ice"};
        System.out.println("MENU KAFE");
        for (int i = 0; i < menu05.length; i++) {
            System.out.println((i + 1) + ". " + menu05[i]);
        }
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String key05 = faf.nextLine();
        int posisi05=0;
        for (int i = 0; i < menu05.length; i++) {
            if (menu05[i].equalsIgnoreCase(key05)) {
                System.out.println("Makanan " + key05 + " TERSEDIA di menu!");
                System.out.println("Posisi: Menu nomor " + (posisi05 + 1));
                break;
            }else{
                System.out.println("Maaf, makanan " + key05 + " TIDAK TERSEDIA di menu.");
            }
        }
        faf.close();
    }
}