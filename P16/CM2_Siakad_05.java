package P16;
import java.util.Scanner;
public class CM2_Siakad_05{
    static Scanner faf=new Scanner(System.in);
    static String[] mataKuliah05={
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris 1",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja",
            "Fisika"
    };
    static int[] sks05={ 2, 2, 2, 2, 2, 2, 3, 2, 2 };
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa05=faf.nextInt();
        faf.nextLine();
        String[] nama05=new String[jumlahMahasiswa05];
        String[] nim05=new String[jumlahMahasiswa05];
        double[][] nilaiAngka05=new double[jumlahMahasiswa05][mataKuliah05.length];
        int pilihan05;
        do {
            System.out.println("SISTEM SIAKAD SEDERHANA");
            System.out.println("1. Input Nilai Mata Kuliah");
            System.out.println("2. Lihat KHS");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            pilihan05=faf.nextInt();
            faf.nextLine();
            switch (pilihan05) {
                case 1:
                    input05(nama05,nim05,nilaiAngka05);
                    break;
                case 2:
                    tampilMenuKHS(nama05,nim05,nilaiAngka05);
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while(pilihan05 != 3);
    }
    static void input05(String[] nama05, String[] nim05, double[][] nilaiAngka05) {
        for (int i = 0; i < nama05.length; i++) {
            System.out.println("Mahasiswa ke-"+(i+1));
            System.out.print("Nama : ");
            nama05[i]=faf.nextLine();
            System.out.print("NIM  : ");
            nim05[i]=faf.nextLine();
            for (int j = 0; j < mataKuliah05.length; j++) {
                double nilai05;
                do{
                    System.out.print("Nilai "+mataKuliah05[j]+": ");
                    nilai05=faf.nextDouble();
                    if(nilai05<0||nilai05>100) {
                        System.out.println("Nilai tidak valid (0-100)");
                    }
                }while(nilai05<0||nilai05>100);
                nilaiAngka05[i][j]=nilai05;
            }
            faf.nextLine();
        }
        System.out.println("[OK] Semua Nilai Berhasil Dimasukkan");
    }
    static void tampilMenuKHS(String[] nama05, String[] nim05, double[][] nilaiAngka05) {
        System.out.println("\nDaftar Mahasiswa:");
        for (int i = 0; i < nama05.length; i++) {
            System.out.println((i+1)+". "+nama05[i]+" / "+nim05[i]);
        }
        System.out.print("Pilih nomor mahasiswa (1-"+nama05.length+"): ");
        int pilih05=faf.nextInt()-1;
        if (pilih05 >= 0 && pilih05 < nama05.length) {
            tampilKHS(nama05[pilih05],nim05[pilih05],nilaiAngka05[pilih05]);
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }
    static void tampilKHS(String nama05, String nim05, double[] nilai05) {
        System.out.println("=====================================================");
        System.out.println("           HASIL KONVERSI NILAI MAHASISWA");
        System.out.println("=====================================================");
        System.out.println("Nama : "+nama05);
        System.out.println("NIM  : "+nim05);
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%-3s %-40s %-4s %-5s %-5s %-5s\n","no", "Mata Kuliah", "SKS", "Nilai", "Huruf", "Setara");
        System.out.println("---------------------------------------------------------------------");
        double totalBobot05=0;
        int totalSks05=0;
        boolean adaE05=false;
        boolean pancasilaMinC05=true;
        for (int i = 0; i < mataKuliah05.length; i++) {
            String huruf05=konversiHuruf05(nilai05[i]);
            double bobot05=konversiIPK05(huruf05);
            System.out.printf("%-3d %-41s %-5d %-5.0f %-4s %-4.1f\n",(i+1),mataKuliah05[i],sks05[i],nilai05[i],huruf05,bobot05);
            totalBobot05+=bobot05*sks05[i];
            totalSks05+=sks05[i];
            if (huruf05.equals("E"))
                adaE05=true;
            if (i == 0 && (huruf05.equals("D") || huruf05.equals("E"))) {
                pancasilaMinC05=false;
            }
        }
        double ip05=totalBobot05/totalSks05;
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Total SKS        : "+totalSks05);
        System.out.println("Total Bobot      : "+totalBobot05);
        System.out.println("Indeks Prestasi  : "+ip05);
        String status05;
        if (ip05 >= 2.0 && pancasilaMinC05 && !adaE05) {
            status05 = "LULUS SEMESTER";
        } else {
            status05 = "TIDAK LULUS SEMESTER";
        }
        System.out.println("Status Semester  : " + status05);
        System.out.println("---------------------------------------------------------------------");
    }
    static String konversiHuruf05(double nilai05) {
        if (nilai05>=85)
            return "A";
        else if (nilai05>=80)
            return "A-";
        else if (nilai05>=75)
            return "B+";
        else if (nilai05>=70)
            return "B";
        else if (nilai05>=65)
            return "B-";
        else if (nilai05>=60)
            return "C+";
        else if (nilai05>=55)
            return "C";
        else if (nilai05>=45)
            return "D";
        else
            return "E";
    }
    static double konversiIPK05(String huruf05) {
        switch (huruf05) {
            case "A":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            default:
                return 0.0;
        }
    }
}
