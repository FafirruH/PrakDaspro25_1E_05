package p10;

import java.util.Scanner;

public class star05 {
    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        System.out.print("Masukkan Nilai n : ");
        int n = faf.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        faf.close();
    }

}
