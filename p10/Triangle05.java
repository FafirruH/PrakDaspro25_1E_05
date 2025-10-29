package p10;
import java.util.Scanner;
public class Triangle05 {
    public static void main(String[] args) {
        Scanner faf=new Scanner(System.in);
        System.out.print("Masukkan Nilai n = ");
        int n = faf.nextInt();
        int i =0;
        while (i<=n) {
            int j=0;
            while (j<=i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
