package p9;
import java.util.Scanner;
public class siakadwhile {
    public static void main(String[] args) {
        Scanner faf=new Scanner(System.in);
        int nilai05,jumlah05,i=0;
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        jumlah05=faf.nextInt();
        while (i<jumlah05) {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+": ");
            nilai05=faf.nextInt();
            if (nilai05<0||nilai05>100) {
                System.out.println("Nilai Tidak Valid Masukkan Nilai Yang Valid!");
                continue;
            }
            if (nilai05>80&&nilai05<=100) {
                System.out.println("Nilai Mahasiswa ke-"+(i+1)+" Adalah A");
            }else if (nilai05>73&&nilai05<=80){
                System.out.println("Nilai Mahasiswa ke-"+(i+1)+" Adalah B+");
            }else if (nilai05>65&&nilai05<=73){
                System.out.println("Nilai Mahasiswa ke-"+(i+1)+" Adalah B");
            }else if (nilai05>60&&nilai05<=65){
                System.out.println("Nilai Mahasiswa ke-"+(i+1)+" Adalah C+");
            }else if (nilai05>50&&nilai05<=60){
                System.out.println("Nilai Mahasiswa ke-"+(i+1)+" Adalah C");
            }else if (nilai05>39&&nilai05<=50){
                System.out.println("Nilai Mahasiswa ke-"+(i+1)+" Adalah D");
            }else{
                System.out.println("Nilai Mahasiswa ke-"+(i+1)+" Adalah E");
            }
            i++;
        }
        faf.close();
    }
    
}
