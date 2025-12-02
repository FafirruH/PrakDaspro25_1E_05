public class PengunjungCafe05 {
    static void daftarPengunjung05(String...namaPengunjung05){
        System.out.println("Daftar nama pengunjung: ");
        for (String nama05 : namaPengunjung05) {
            System.out.println("- "+nama05);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung05("Ali","Budi","Citra");
        daftarPengunjung05("Andi");
        daftarPengunjung05("Doni","Eti","Fahmi","Galih");
    }
}
