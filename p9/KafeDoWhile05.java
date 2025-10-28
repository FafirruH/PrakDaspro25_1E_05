package p9;

import java.util.Scanner;

public class KafeDoWhile05 {
    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        int kopi05, teh05, roti05;
        String namaPelanggan05;
        int hargaKopi05 = 12000, hargaTeh05 = 7000, hargaRoti05 = 20000;
        do {
            System.out.print("Masukkan Nama Pelanggan (Ketik 'Batal' Untuk Keluar): ");
            namaPelanggan05 = faf.nextLine();
            if (namaPelanggan05.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi Dibatalkan");
                break;                
            }
        System.out.print("Jumlah Kopi : ");
        kopi05=faf.nextInt();
        System.out.print("Jumlah Teh : ");
        teh05=faf.nextInt();
        System.out.print("Jumlah Roti : ");
        roti05=faf.nextInt();
        int totalHarga05=(kopi05*hargaKopi05)+(teh05*hargaTeh05)+(roti05*hargaRoti05);
        System.out.println("Total Yang Harus Dibayarkan : Rp "+totalHarga05);
        faf.nextLine();
        }while(true);
        
        faf.close();
    }

}
