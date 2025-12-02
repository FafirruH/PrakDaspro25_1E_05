package P14;
import java.util.Scanner;
public class RekapPenjualanCafe05 {
    static Scanner faf=new Scanner(System.in);
    static String[] menu05 = {
        "kopi",
        "Teh",
        "Es Kelapa Muda",
        "Roti Bakar",
        "Gorengan"
    };
    static void inputData05(int[][] penjualan05) {

        for (int i = 0; i < menu05.length; i++) {
            System.out.println("Menu : " + menu05[i]);
                for (int j = 0; j < 7; j++) {
                    System.out.print("Hari ke-" + (j+1) + ": ");
                    penjualan05[i][j] = faf.nextInt();
                }
        }
    }
    static void tampilData05(int[][] penjualan05) {
        System.out.println("TABEL PENJUALAN 7 HARI");
        System.out.printf("%-15s", "Menu");
        for (int i = 0; i <= 7; i++) {
            System.out.printf("Hari %d ", i);
        }
        System.out.println();
        for (int i = 0; i < menu05.length; i++) {
            System.out.printf("%-15s", menu05[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf("%-7d ", penjualan05[i][j]);
            }
            System.out.println();
        }
    }
    static void menuTertinggi05(int[][] penjualan05) {
        int totalMax05 = -1;
        String menuMax05 = "";
        for (int i = 0; i < menu05.length; i++) {
            int total05 = 0;
            for (int j = 0; j < 7; j++) {
                total05 += penjualan05[i][j];
            }
            if (total05 > totalMax05) {
                totalMax05 = total05;
                menuMax05 = menu05[i];
            }
        }
        System.out.println("MENU DENGAN PENJUALAN TERTINGGI");
        System.out.println("Menu : " + menuMax05);
        System.out.println("Total penjualan : " + totalMax05);
    }
    static void rataRataMenu05(int[][] penjualan05) {
        System.out.println("RATA RATA PENJUALAN");

        for (int i = 0; i < menu05.length; i++) {
            int total05 = 0;
            for (int j = 0; j < 7; j++) {
                total05 += penjualan05[i][j];
            }
            double rata05 = (double) total05/7;
            System.out.printf("%-15s : %.2f\n", menu05[i], rata05);
        }
    }
    public static void main(String[] args) {
        int[][] penjualan05 = new int[5][7];
        inputData05(penjualan05);
        tampilData05(penjualan05);
        menuTertinggi05(penjualan05);
        rataRataMenu05(penjualan05);
    }
}
