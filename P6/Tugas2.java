import java.util.Scanner;
public class Tugas2 {

    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        int angka05,hasil05;
        System.out.print("Masukkan Angka : ");
        angka05=faf.nextInt();
        hasil05=angka05%2;
        if (hasil05 == 0) {
            System.out.println("genap");
        }else{
            System.out.println("ganjil");
        }
    }
}