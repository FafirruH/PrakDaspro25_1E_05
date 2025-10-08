import java.util.Scanner;
public class Tugas3 {

    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        String user05;
        int sks05;
        System.out.println("Dosen/Mahasiswa");
        user05=faf.next();
        if (user05.equalsIgnoreCase("dosen")) {
            System.out.println("akses diberikan");
        }else if(user05.equalsIgnoreCase("mahasiswa")){
            System.out.println("berapa sks anda : ");
            sks05=faf.nextInt();
            if (sks05>=12) {
                System.out.println("akses diberikan");
            }else{
                System.out.println("akses ditolak");
            }
        }else{
            System.out.println("akses ditolak");
        }
    }
}