package P12;
import java.util.Scanner;

public class bioskopWithScanner05 {
    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        String[][] penonton05 = new String[4][2];
        int pilihan05;

        do {
            System.out.println("\nMENU BIOSKOP");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan05 = faf.nextInt();
            faf.nextLine();

            switch (pilihan05) {
                case 1:
                    String nama05, next05;
                    int baris05, kolom05;
                    while (true) {
                        System.out.print("Masukkan Nama: ");
                        nama05 = faf.nextLine();
                        System.out.print("Masukkan Baris (1-4): ");
                        baris05 = faf.nextInt();
                        System.out.print("Masukkan Kolom (1-2): ");
                        kolom05 = faf.nextInt();
                        faf.nextLine();
                        if (baris05>4||baris05<1) {
                            System.out.println("Baris tidak tersedia, Masukkan Ulang");
                            continue;
                        }else if(kolom05>2||kolom05<1){
                            System.out.println("Kolom Tidak tersedia, Masukkan Ulang");
                            continue;                        }
                        penonton05[baris05 - 1][kolom05 - 1] = nama05;
                        System.out.print("Input penonton lain? (y/n): ");
                        next05 = faf.next();
                        faf.nextLine();
                        if (next05.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nDAFTAR PENONTON");
                    for (int i = 0; i < penonton05.length; i++) {
                        for (int j = 0; j < penonton05[i].length; j++) {
                            System.out.print(penonton05[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan05 != 3);

        faf.close();
    }
}