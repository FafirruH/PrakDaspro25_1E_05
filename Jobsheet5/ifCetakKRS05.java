import java.util.Scanner;
public class ifCetakKRSNoPresensi {

    public static void main(String[] args) {
        
        Scanner faf = new Scanner(System.in);
        String cetak05;
        System.out.println("--- Cetak KRS Siakad ---");
        System.out.println("Apakah UKT Sudah Lunas? (true/false)");
        boolean uktLunas05 = faf.nextBoolean();
        //if (uktLunas) {
            //System.out.println("Pembayaran UKT Terverifikasi");
            //System.out.println("Silahkan Cetak KRS");
        //} else {
          //  System.out.println("Registrasi ditolak Silahkan Lunasi UKT");
        //}
        cetak05=uktLunas05 ? "pembayaran UKKT diverifikasi" + "silahkan cetak KRS dan minta Tanda tangan" : "maaf resigstrasi ditolak";
        System.out.println(cetak05);

    }
}