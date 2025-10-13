import java.util.Scanner;

public class CM_Siakad_05 {
    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        
        System.out.println("====== INPUT DATA MAHASISWA ======");
        System.out.print("Nama : ");
        String nama05 = faf.nextLine();
        System.out.print("NIM  : ");
        String nim05 = faf.nextLine();
        
        System.out.println("Masukkan Nilai Angka (0 - 100):");
        
        System.out.print("1. Pancasila: ");
        double nilaiPancasila05 = faf.nextDouble();
        
        System.out.print("2. Dasar Pemrograman: ");
        double nilaiDaspro05 = faf.nextDouble();
        
        System.out.print("3. Bahasa Inggris : ");
        double nilaiBIG05 = faf.nextDouble();
        
        if (nilaiPancasila05 < 0 || nilaiPancasila05 > 100 || 
            nilaiDaspro05 < 0 || nilaiDaspro05 > 100 || 
            nilaiBIG05 < 0 || nilaiBIG05 > 100) {
            System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100.");
        }
        
        int sksPancasila05 = 2;
        int sksDaspro05 = 3;
        int sksBIG05 = 2;
        
        String hurufPancasila05;
        double ipPancasila05;
        if (nilaiPancasila05 >= 80 && nilaiPancasila05 <= 100) {
            hurufPancasila05 = "A";
            ipPancasila05 = 4.0;
        } else if (nilaiPancasila05 >= 73 && nilaiPancasila05 < 80) {
            hurufPancasila05 = "B+";
            ipPancasila05 = 3.5;
        } else if (nilaiPancasila05 >= 65 && nilaiPancasila05 < 73) {
            hurufPancasila05 = "B";
            ipPancasila05 = 3.0;
        } else if (nilaiPancasila05 >= 60 && nilaiPancasila05 < 65) {
            hurufPancasila05 = "C+";
            ipPancasila05 = 2.5;
        } else if (nilaiPancasila05 >= 50 && nilaiPancasila05 < 60) {
            hurufPancasila05 = "C";
            ipPancasila05 = 2.0;
        } else if (nilaiPancasila05 >= 39 && nilaiPancasila05 < 50) {
            hurufPancasila05 = "D";
            ipPancasila05 = 1.0;
        } else {
            hurufPancasila05 = "E";
            ipPancasila05 = 0.0;
        }
        
        String hurufDaspro05;
        double ipDaspro05;
        if (nilaiDaspro05 >= 80 && nilaiDaspro05 <= 100) {
            hurufDaspro05 = "A";
            ipDaspro05 = 4.0;
        } else if (nilaiDaspro05 >= 73 && nilaiDaspro05 < 80) {
            hurufDaspro05 = "B+";
            ipDaspro05 = 3.5;
        } else if (nilaiDaspro05 >= 65 && nilaiDaspro05 < 73) {
            hurufDaspro05 = "B";
            ipDaspro05 = 3.0;
        } else if (nilaiDaspro05 >= 60 && nilaiDaspro05 < 65) {
            hurufDaspro05 = "C+";
            ipDaspro05 = 2.5;
        } else if (nilaiDaspro05 >= 50 && nilaiDaspro05 < 60) {
            hurufDaspro05 = "C";
            ipDaspro05 = 2.0;
        } else if (nilaiDaspro05 >= 39 && nilaiDaspro05 < 50) {
            hurufDaspro05 = "D";
            ipDaspro05 = 1.0;
        } else {
            hurufDaspro05 = "E";
            ipDaspro05 = 0.0;
        }
        
        String hurufBIG05;
        double ipBIG05;
        if (nilaiBIG05 >= 80 && nilaiBIG05 <= 100) {
            hurufBIG05 = "A";
            ipBIG05 = 4.0;
        } else if (nilaiBIG05 >= 73 && nilaiBIG05 < 80) {
            hurufBIG05 = "B+";
            ipBIG05 = 3.5;
        } else if (nilaiBIG05 >= 65 && nilaiBIG05 < 73) {
            hurufBIG05= "B";
            ipBIG05 = 3.0;
        } else if (nilaiBIG05 >= 60 && nilaiBIG05 < 65) {
            hurufBIG05 = "C+";
            ipBIG05 = 2.5;
        } else if (nilaiBIG05 >= 50 && nilaiBIG05 < 60) {
            hurufBIG05 = "C";
            ipBIG05 = 2.0;
        } else if (nilaiBIG05 >= 39 && nilaiBIG05 < 50) {
            hurufBIG05 = "D";
            ipBIG05 = 1.0;
        } else {
            hurufBIG05 = "E";
            ipBIG05 = 0.0;
        }
        
        int totalSKS05 = sksPancasila05 + sksDaspro05 + sksBIG05;
        double totalBobot05 = (ipPancasila05 * sksPancasila05) + 
                           (ipDaspro05 * sksDaspro05) + 
                           (ipDaspro05 * sksBIG05);
        
        double ip05 = totalBobot05 / totalSKS05;
        
        String statusSemester;
        if (ip05 < 2.00) {
            statusSemester = "TIDAK LULUS (IP Minimal 2.00)";
        } else if (hurufPancasila05.equals("D") || hurufPancasila05.equals("E")) {
            statusSemester = "TIDAK LULUS (Nilai Pancasila D atau E)";
        } else {
            statusSemester = "LULUS";
        }
        
        System.out.println("====== HASIL KONVERSI NILAI MAHASISWA ======");
        System.out.println("Nama : " + nama05);
        System.out.println("NIM  : " + nim05);
        System.out.println();
        System.out.println("Mata Kuliah          SKS  Nilai  Huruf  Setara");
        System.out.println("----------------------------------------------");
        System.out.println("Pancasila              " + sksPancasila05 + "   " + nilaiPancasila05 + "    " + hurufPancasila05 + "     " + ipPancasila05);
        System.out.println("Dasar Pemrograman      " + sksDaspro05 + "   " + nilaiDaspro05 + "    " + hurufDaspro05 + "     " + ipDaspro05);
        System.out.println("Bahasa Inggris         " + sksBIG05 + "   " + nilaiBIG05 + "    " + hurufBIG05 + "     " + ipBIG05);
        System.out.println();
        System.out.println("Total SKS   : " + totalSKS05);
        System.out.println("Total Bobot : " + totalBobot05);
        System.out.println("Indeks Prestasi (IP): " + ip05);
        System.out.println("Status Semester : " + statusSemester);
        
        faf.close();
    }
}