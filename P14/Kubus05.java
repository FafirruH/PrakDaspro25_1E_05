package P14;
import java.util.Scanner;
public class Kubus05 {
    static Scanner faf = new Scanner(System.in);
    public static int hitungVolume05(int sisi05) {
        return sisi05 * sisi05 * sisi05;
    }
    public static int hitungLuasPermukaan05(int sisi05) {
        return 6 * sisi05 * sisi05;
    }
    public static void tampilkanHasil05(int sisi05, int volume05, int luasPermukaan05) {
        System.out.println("HASIL PERHITUNGAN KUBUS");
        System.out.println("Panjang Sisi       : " + sisi05);
        System.out.println("Volume Kubus       : " + volume05);
        System.out.println("Luas Permukaan     : " + luasPermukaan05);
    }
    public static void main(String[] args) {
        System.out.print("Masukkan panjang sisi kubus (cm): ");
            int sisi05 = faf.nextInt();
            int volume05 = hitungVolume05(sisi05);
            int luasPermukaan05 = hitungLuasPermukaan05(sisi05);
            tampilkanHasil05(sisi05, volume05, luasPermukaan05);
        faf.close();
    }
}