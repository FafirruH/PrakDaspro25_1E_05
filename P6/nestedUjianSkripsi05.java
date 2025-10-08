import java.util.Scanner;
public class nestedUjianSkripsi05 {

    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        String pesan05;
        System.out.println("Apakah mahasiswa bebas kompen? (ya/tidak)");
        String bebasKompen05 = faf.nextLine().trim();
        System.out.println("Masukkan Jumlah log bimbingan pembimbing 1: ");
        int bimbinganp105 = faf.nextInt();
        System.out.println("Masukkan Jumlah log bimbingan pembimbing 2: ");
        int bimbinganp205 = faf.nextInt();
        
        if (bebasKompen05.equalsIgnoreCase("ya")){
            if (bimbinganp105 >= 8 && bimbinganp205 >= 4) {
                pesan05 = "Semua Syarat Terpenuhi Mahasiswa Boleh Mendaftar Ujian Skripsi";
            } else if (bimbinganp105 < 8 && bimbinganp205 < 4){
                pesan05 = "Gagal Log Bimbingan P1 Kurang Dari 8X dan P3 Kurang dari 4X";
            }else if (bimbinganp105 < 8){
                pesan05 = "Gagal Log Bimbingan  P1 Belum Mencapai 8X";
            }else {
                pesan05 = "Gagal Log Bimbingan  P2 Belum Mencapai 4X";
            }

        }else{
            pesan05 = "Gagal Mahasiswa masih memiliki tanggungan kompen";
        }System.out.println(pesan05);
    }
}