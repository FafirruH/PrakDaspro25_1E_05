public class PengunjungCafe05 {
    static void daftarPengunjung05(String...namaPengunjung05){
        System.out.println("Daftar nama pengunjung: ");
        for (int i = 0; i < namaPengunjung05.length; i++) {
            System.out.println("- "+namaPengunjung05);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung05("Ali","Budi","Citra");
        daftarPengunjung05("Andi");
        daftarPengunjung05("Doni","Eti","Fahmi","Galih");
    }
}
