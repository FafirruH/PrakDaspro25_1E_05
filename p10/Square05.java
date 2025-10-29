package p10;

import java.util.Scanner;

public class Square05 {
    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        System.out.print("Masukkan Nilai N : ");
        int n = faf.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        faf.close();
    }

}
