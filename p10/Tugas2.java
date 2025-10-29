package p10;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner faf=new Scanner(System.in);
        System.out.print("Masukkan Ukuran Persegi : ");
        int nilai05=faf.nextInt();
        for (int i = 1; i <= nilai05; i++) {
            for (int j = 1; j <= nilai05; j++) {
                if (i==1||i==nilai05) {
                System.out.print(nilai05);
                }else if (j==1||j==nilai05) {
                    System.out.print(nilai05);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            faf.close();
        }
    }
    
}