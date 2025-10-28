package p9;
import java.util.Scanner;

public class siakadfor05 {
    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        double nilai05, tertinggi05=0,terendah05=100;
        for (int i = 1; i <=10; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke - "+i+": ");
            nilai05=faf.nextDouble();
            if (nilai05>tertinggi05) {
                tertinggi05=nilai05;
            }
            if (nilai05<terendah05) {
                terendah05=nilai05;                
            }
        }
        System.out.println("Nilai Tertinggi Adalah "+tertinggi05);
        System.out.println("Nilai Terendah Adalah "+terendah05);
        faf.close();
    }

    
}